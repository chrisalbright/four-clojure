(ns four-clojure.core
  (:gen-class))

(defn problem-43 [xs n & ys]
  (if (< (count xs) n) ys
      (let [seqs (or (seq ys) (repeat n []))]
        (recur (drop n xs) n (map conj seqs xs)))))