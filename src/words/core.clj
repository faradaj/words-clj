(ns words.core
	(:require [clojure.string :as str]
            [words.utils :as utils]))

(defn- get-words-of-text
  "Gets a text, lowercases it. Returns the list of words in it."
  [text]
  (str/split (str/lower-case text) #" "))

(defn remove-after-punc
  "Gets a word, removes after-punctuation part of it. Returns that word."
  [word]
  (apply str (first
    (remove str/blank? ; If first char is a punctuation mark, first of split will be ""
      (str/split word (re-pattern "[.,!?'\"-()]"))))))

(defn cleanup-words
  "Gets a words list, cleans up words in it. Returns that list"
  [words]
  (map remove-after-punc words))

(def not-nouns
  "List of not-nouns." 
  ; TODO: Provide a list of not-nouns from a file.
  '("a", "an", "the", "and", "of", "am", "is", "are"))

(defn- remove-invalid-words
  "Gets a words list, removes not-nouns from it. Returns that list."
  [words]
  (filter (fn [x] (not (some #{x} not-nouns))) words))

(defn- map-words
  "Gets a word list, maps words with frequencies. Returns that map."
  [words]
  (reduce 
    #(assoc %1 %2 (inc (get %1 %2 0))) {} words))

; Top function
(defn get-word-frequencies-of-text
  "Gets a text. Returns a map of words and frequencies, sorted with descending frequencies."
  [text]
  ((comp
    utils/omg-sort
    map-words
    remove-invalid-words
    cleanup-words
    get-words-of-text) text))
