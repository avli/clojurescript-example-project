(defproject clojurescript-example-project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [cider/piggieback "0.4.1"]]

                 :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}

                 :plugins [[lein-cljsbuild "1.1.7"]
                           [cider/cider-nrepl "0.22.1"]]

                 :cljsbuild {
                  :builds [{:id "dev"
                            :source-paths ["src/clojurescript_example_project"]
                            :compiler {
                                       :output-to "resources/public/main.js"
                                       :output-dir "resources/public/out"
                                       :optimizations :none
                                       :source-map true}}]})
