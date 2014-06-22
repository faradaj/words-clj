(defproject words "0.1.0-SNAPSHOT"
  :description "An app that outputs word frequencies of given text"
  :url "http://github.com/faradaj/words-clj"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot words.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
