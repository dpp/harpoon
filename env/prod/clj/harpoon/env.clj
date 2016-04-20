(ns harpoon.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[harpoon started successfully]=-"))
   :middleware identity})
