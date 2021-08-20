(ns four-clojure.dev
  (:require
   [clojure.tools.namespace.repl :refer [refresh refresh-all]]
   [clojure.repl :refer :all]
   [clojure.pprint :refer [print-table pprint]]
   [clojure.string :as str]
   [clojure.java.io :as io]))

(println "Loaded Dev")

(defn subseqs [ys x & xs]
  (println (inc x))
  (println (first xs))
  (if-not (= (inc x) (first xs)) ys
          (recur (conj ys x) (first xs) (rest xs))))

(defn foo [xs]
  (reduce subseqs [] xs))

(def l [1 0 1 2 3 0 4 5])

;; (if
;;   (= (foo l) [0 1 2 3])
;;   (println "Yay")
;;   (println "Boo"))
