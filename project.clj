(defproject yieldbot/hambo "0.1.0-SNAPSHOT"
  :description "A CQL-based Trident state implementation for Cassandra"
  :url "https://github.com/yieldbot/hambo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"releases" {:url "s3p://maven.yieldbot.com/releases/"
                             :username :env :passphrase :env}
                 "snapshots" {:url "s3p://maven.yieldbot.com/snapshots/"
                              :username :env :passphrase :env}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [yieldbot/marceline "0.2.2-SNAPSHOT"]
                 [clojurewerkz/cassaforte "2.0.0"]]
  :profiles {:provided {:dependencies [[org.apache.storm/storm-core "0.9.3"]]}}
  :plugins [[s3-wagon-private "1.1.2"]])
