; Copyright 2016 Cognitect, Inc.

; The use and distribution terms for this software are covered by the
; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0)
; which can be found in the file epl-v10.html at the root of this distribution.
;
; By using this software in any fashion, you are agreeing to be bound by
; the terms of this license.
;
; You must not remove this notice, or any other, from this software.

(defproject io.pedestal/pedestal.route "0.5.1-SNAPSHOT"
  :description "Pedestal route definition and router construction"
  :url "https://github.com/pedestal/pedestal"
  :scm "https://github.com/pedestal/pedestal"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [io.pedestal/pedestal.log "0.5.1-SNAPSHOT"]
                 [io.pedestal/pedestal.interceptor "0.5.1-SNAPSHOT"]
                 [org.clojure/core.incubator "0.1.3"]]
  :min-lein-version "2.0.0"
  :global-vars {*warn-on-reflection* true}

  :aliases {"docs" ["with-profile" "docs" "codox"]}

  :profiles {:docs {:pedantic? :ranges
                    :plugins [[lein-codox "0.9.5"]]}})