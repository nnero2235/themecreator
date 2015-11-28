(ns app.previews
  (:require [app.db :refer [app-db]]))

(defn span-component
  "span-component represents a span component
   with a text content 'text' of background-color 
   'color'"
  [text color]
  [:span {:style {:color (color @app-db)} } (str text)])

(defn preview-javascript
  []
  [:div
   [span-component "// Sieve of Eratosthenes" :comment]
   [:br]
   [:br]
   [span-component "function " :keyword]
   [span-component "eratosthenes" :functionname]
   [span-component "(" :mainfg]
   [span-component "limit" :constant]
   [span-component ") {" :mainfg]
   [:br]
   [span-component "  var " :keyword]
   [span-component "primes " :variable]
   [span-component "= [];" :mainfg]
   [:br]
   [span-component "  if " :keyword]
   [span-component "(limit >= 2) {" :mainfg]
   [:br]
   [span-component "    var " :keyword]
   [span-component "sqrtlmt " :variable]
   [span-component "= " :mainfg]
   [span-component "Math" :type]
   [span-component "." :mainfg]
   [span-component "sqrt" :builtin]
   [span-component "(" :mainfg]
   [span-component "limit" :variable]
   [span-component ") - 2;" :mainfg]
   [:br]
   [span-component "    var " :keyword]
   [span-component "nums " :variable]
   [span-component "= new " :mainfg]
   [span-component "Array" :type]
   [span-component "();" :mainfg]
   [span-component " // start with an empty Array." :comment]
   [:br]
   [span-component "    for " :keyword]
   [span-component "(" :mainfg]
   [span-component "var " :keyword]
   [span-component "i " :variable]
   [span-component "= 2; " :mainfg]
   [span-component "i " :variable]
   [span-component "<= " :mainfg]
   [span-component "limit" :variable]
   [span-component "; " :mainfg]
   [span-component "i" :variable]
   [span-component "++)" :mainfg]
   [:br]
   [span-component "      nums" :variable]
   [span-component "." :mainfg]
   [span-component "push" :builtin]
   [span-component "(" :mainfg]
   [span-component "i" :variable]
   [span-component ");" :mainfg]
   [:br]] )

(defn preview-typescript
  []
  [:div
   [span-component "import" :keyword]
   [span-component " {Theme}" :mainfg]
   [span-component " from " :keyword]
   [span-component "'./Theme'" :string]
   [span-component ";" :mainfg]
   [:br]
   [span-component "import" :keyword]
   [span-component " {Face}" :mainfg]
   [span-component " from " :keyword]
   [span-component "'./Face'" :string]
   [span-component ";" :mainfg]
   [:br]
   [span-component "import" :keyword]
   [span-component " {Injectable} " :mainfg]
   [span-component "from " :keyword]
   [span-component "'angular2/angular2'" :string]
   [span-component ";" :mainfg]
   [:br]
   [:p]
   [:p]
   [span-component "@Injectable" :type]
   [span-component "()" :mainfg]
   [:br]
   [span-component "export" :keyword]
   [span-component " class Themeservice " :type]
   [span-component "{" :mainfg]
   [:br]
   [span-component "  theme" :variable]
   [span-component ": " :mainfg]
   [span-component "Theme" :type]
   [span-component ";" :mainfg]
   [:br]
   [:br]
   [span-component "  constructor" :keyword]
   [span-component "(theme: Theme) {" :mainfg]
   [:br]
   [span-component "    this" :keyword]
   [span-component "." :mainfg]
   [span-component "theme" :variable]
   [span-component " = theme" :mainfg]
   [:br]
   [span-component "  }" :mainfg]
   [:br]
   [:br]
   [span-component "  getTheme" :functionname]
   [span-component "() : Theme {" :mainfg]
   [:br]
   [span-component "    return this" :keyword]
   [span-component "." :mainfg]
   [span-component "theme" :variable]
   [:br]
   [span-component "  }" :mainfg]
   [:br]
   [:br]
   [span-component "  setTheme" :functionname]
   [span-component "(theme: Theme) {" :mainfg]
   [:br]
   [span-component "    this" :keyword]
   [span-component "." :mainfg]
   [span-component "theme" :variable]
   [span-component " = theme" :mainfg]
   [:br]
   [span-component "  }" :mainfg]
   [:br]
   [:br]
   [span-component "  // changeColor sets one themeface of" :comment]
   [:br]
   [span-component "  // 'theme' to a given color." :comment]
   [:br]
   [span-component "  changeColor" :functionname]
   [span-component "(face: Face): " :mainfg]
   [span-component "void " :type]
   [span-component "{" :mainfg]
   [:br]
   [span-component "    for" :keyword]
   [span-component " (" :mainfg]
   [span-component "var " :keyword]
   [span-component "i " :mainfg]
   [span-component "of " :keyword]
   [span-component "this" :variable]
   [span-component ".theme.faces) {" :mainfg]
   [:br]
   [span-component "      if " :keyword]
   [span-component "(i." :mainfg]
   [span-component "name " :variable]
   [span-component "== face." :mainfg]
   [span-component "name" :variable]
   [span-component ") {" :mainfg]
   [:br]
   [span-component "        i." :mainfg]
   [span-component "color" :variable]
   [span-component " = face." :mainfg]
   [span-component "color" :variable]
   [span-component ";" :mainfg]
   [:br]
   [span-component "      }" :mainfg]
   [:br]
   [span-component "    }" :mainfg]
   [:br]
   [span-component "  }" :mainfg]
   [:br]
   [span-component "}" :mainfg]])

