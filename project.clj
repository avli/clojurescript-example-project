(defproject clojurescript-example-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.908"]
                 [com.cemerick/piggieback "0.2.2"]
                 [org.clojure/tools.nrepl "0.2.10"]
                 [cider/cider-nrepl "0.15.0-SNAPSHOT"]]
                 
                 :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

                 :plugins [[lein-cljsbuild "1.1.7"]]

                 :cljsbuild {
                  :builds [{:id "dev"
                            :source-paths ["src/clojurescript_example_project"]
                            :compiler {
                                       :output-to "resources/public/main.js"
                                       :output-dir "resources/public/out"
                                       :optimizations :none
                                       :source-map true}}]})
