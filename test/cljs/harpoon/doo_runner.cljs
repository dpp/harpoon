(ns harpoon.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [harpoon.core-test]))

(doo-tests 'harpoon.core-test)

