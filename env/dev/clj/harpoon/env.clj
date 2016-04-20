(ns harpoon.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [harpoon.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[harpoon started successfully using the development profile]=-"))
   :middleware wrap-dev})
