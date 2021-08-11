(ns four-clojure.core
  (:gen-class))

(defn problem-43 [xs n & ys]
  (if (< (count xs) n) ys
      (as-> ys $
        (or (seq $) (repeat n []))
        (recur (drop n xs) n (map conj $ xs)))))

(defn problem-44 [x xs]
  (as-> xs $
    (count $)
    (mod x $)
    (concat (drop $ xs) (take $ xs))))