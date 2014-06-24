(ns words.core-test
  (:require [clojure.test :refer :all]
            [words.core :refer :all]))

(deftest remove-after-punc-test
	(testing "Removing after-punctuation part of word."
		(let [word "joe's"]
		(is (= "joe" (remove-after-punc word))))))

(deftest cleanup-words-test
	(testing "Getting raw forms of words from a list of them."
		(let [words '("joe's", "here.", "joe\"", "\"joe\"")]
			(is (= '("joe", "here", "joe", "joe") (cleanup-words words))))))

(deftest word-count-test
	(testing "One word test."
		(let [text "hello hello hello"]
			(is (= {"hello" 3} (get-word-frequencies-of-text text)))))
	(testing "More than one word test."
		(let [text "hello merhaba hello"]
			(is (= {"hello" 2, "merhaba" 1} (get-word-frequencies-of-text text)))
			(not (= {"merhaba" 1, "hello" 2} (get-word-frequencies-of-text text)))))
	(testing "General test."
		(let [text "Hello, joe's here. I mean 'Joe', not Jim."]
			(is (= {"joe" 2, "hello" 1, "mean" 1, "here" 1, "i" 1, "jim" 1, "not" 1} (get-word-frequencies-of-text text))))))
