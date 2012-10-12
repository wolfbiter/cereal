(defproject cereal "0.0.1-SNAPSHOT"
  :description "Reads midi port input and converts it to serial output."
  :dependencies [[org.clojure/clojure "1.4.0"]
		 [com.leadtune/clojure-zmq "2.1.0"]
                 [overtone/midi-clj "0.1"]])
