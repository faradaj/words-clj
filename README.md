## words

words is a Clojure app that outputs word frequencies of given text.

[Here][1]'s a blog post for Clojure beginners mentioning the **words**.

### Example

Input:
```bash
words.core=> (words.core/get-word-frequencies-of-text "Lisp (historically, LISP) is a family of computer programming languages with a long history and a distinctive, fully parenthesized Polish prefix notation.")
```

Output:
```bash
{"lisp" 2, "with" 1, "programming" 1, "prefix" 1, "polish" 1, "parenthesized" 1, "notation" 1, "long" 1, "languages" 1, "history" 1, "historically" 1, "fully" 1, "family" 1, "distinctive" 1, "computer" 1}
```

### Credits

Sorting maps by value function, [omg-sort][2].

### License

	The MIT License (MIT)
    
    Copyright (c) 2014 Gokberk Ergun
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.


[1]: http://blog.faradaj.com/post/89511968217
[2]: http://tllake.blogspot.com.tr/2010/10/sorting-clojure-maps-by-value.html