(ns user
  (:require [mount.core :as mount]
            [harpoon.figwheel :refer [start-fw stop-fw cljs]]
            harpoon.core))

(defn start []
  (mount/start-without #'harpoon.core/repl-server))

(defn stop []
  (mount/stop-except #'harpoon.core/repl-server))

(defn restart []
  (stop)
  (start))


