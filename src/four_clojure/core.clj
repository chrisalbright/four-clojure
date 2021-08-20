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

(defn problem-46 [fn] #(fn %2 %1))

(defn problem-49 [n xs] [(take n xs) (drop n xs)])

(defn problem-50 [xs]
  (->> xs
       (group-by type)
       (vals)))

(defn problem-54 [x xs]
  (loop [ys [] zs xs]
    (if (< (count zs) x)
      ys
      (recur (conj ys (take x zs)) (drop x zs)))))

(defn problem-55 [xs]
  (apply (partial merge-with +) (map (fn [x] {x 1}) xs)))

(defn problem-56
  ([xs] (problem-56 xs [] #{}))
  ([[x & xs] ys seen]
   (let [ys (if (seen x)
              ys
              (conj ys x))]
     (if-not (seq xs)
       ys
       (recur xs ys (conj seen x))))))
