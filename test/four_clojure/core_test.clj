(ns four-clojure.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [four-clojure.core :as core]))

(deftest four-clojure-medium

  (testing "Problem 43"
    (is (= (core/problem-43 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
    (is (= (core/problem-43 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
    (is (= (core/problem-43 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))))

  (testing "Problem 44"
    (is (= (core/problem-44 2 [1 2 3 4 5]) '(3 4 5 1 2)))
    (is (= (core/problem-44 -2 [1 2 3 4 5]) '(4 5 1 2 3)))
    (is (= (core/problem-44 6 [1 2 3 4 5]) '(2 3 4 5 1)))
    (is (= (core/problem-44 1 '(:a :b :c)) '(:b :c :a)))
    (is (= (core/problem-44 -4 '(:a :b :c)) '(:c :a :b))))

  (testing "Problem 46"
    (is (= 3 ((core/problem-46 nth) 2 [1 2 3 4 5])))
    (is (= true ((core/problem-46 >) 7 8)))
    (is (= 4 ((core/problem-46 quot) 2 8)))
    (is (= [1 2 3] ((core/problem-46 take) [1 2 3 4 5] 3))))

  (testing "Problem 49"
    (is (= (core/problem-49 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
    (is (= (core/problem-49 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
    (is (= (core/problem-49 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])))

  (testing "Problem 50"
    (is (= (set (core/problem-50 [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
    (is (= (set (core/problem-50 [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
    (is (= (set (core/problem-50 [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})))

  '(testing "Problem 53" ; advanced problem
     (is (= (core/problem-53 [1 0 1 2 3 0 4 5]) [0 1 2 3]))
     (is (= (core/problem-53 [5 6 1 3 2 7]) [5 6]))
     (is (= (core/problem-53 [2 3 3 4 5]) [3 4 5]))
     (is (= (core/problem-53 [7 6 5 4]) [])))

  (testing "Problem 54"
    (is (= (core/problem-54 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
    (is (= (core/problem-54 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
    (is (= (core/problem-54 3 (range 8)) '((0 1 2) (3 4 5)))))

  (testing "Problem 55"
    (is (= (core/problem-55 [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
    (is (= (core/problem-55 [:b :a :b :a :b]) {:a 2, :b 3}))
    (is (= (core/problem-55 '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))

  (testing "Problem 56"
    (is (= (core/problem-56 [1 2 1 3 1 2 4]) [1 2 3 4]))
    (is (= (core/problem-56 [:a :a :b :b :c :c]) [:a :b :c]))
    (is (= (core/problem-56 '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (is (= (core/problem-56 (range 50)) (range 50)))))

