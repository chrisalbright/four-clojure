(ns four-clojure.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [four-clojure.core :refer :all]))

(deftest four-clojure-medium
  (testing "Problem 43"
    (is (= (problem-43 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
    (is (= (problem-43 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
    (is (= (problem-43 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))
