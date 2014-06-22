(ns words.utils)

; omg-sort source: http://tllake.blogspot.com.tr/2010/10/sorting-clojure-maps-by-value.html
(defn omg-sort
	"create a map sorted in descending order, first by value, then by key"
  	[super-map]
  	(into (sorted-map-by 
    	(fn [key1 key2] 
      	(let [val1 (super-map key1) val2 (super-map key2)] 
        	(cond 
          		(= val1 val2) (.compareTo key2 key1) 
          		(< val1 val2) 1 
          		:else -1)))) super-map))
