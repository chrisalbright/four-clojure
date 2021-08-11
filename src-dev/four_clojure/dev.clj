(ns four-clojure.dev
  (:require
   [clojure.tools.namespace.repl :refer [refresh refresh-all]]
   [clojure.repl :refer :all]
   [clojure.pprint :refer [print-table pprint]]
   [clojure.string :as str]
   [clojure.java.io :as io]))

(println "Loaded Dev")