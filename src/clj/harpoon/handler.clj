(ns harpoon.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [harpoon.layout :refer [error-page]]
            [harpoon.routes.home :refer [home-routes]]
            [harpoon.routes.services :refer [service-routes]]
            [compojure.route :as route]
            [harpoon.middleware :as middleware]))

(def app-routes
  (routes
    #'service-routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(defn app [] (middleware/wrap-base #'app-routes))
