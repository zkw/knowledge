(ns properties.highest_point
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "highest-point")

(name-as-in "highest-point" "höchste Erhebung" "de")
(name-as-in "highest-point" "" "zh-hk")
(name-as-in "highest-point" "" "zh-tw")
(name-as-in "highest-point" "наивысшая точка" "ru")
(name-as-in "highest-point" "ponto mais alto" "pt")
(name-as-in "highest-point" "highest point" "en")
(name-as-in "highest-point" "最高点" "zh-cn")
(name-as-in "highest-point" "point culminant" "fr")
(name-as-in "highest-point" "punto más alto" "es")
(name-as-in "highest-point" "" "zh-sg")
(name-as-in "highest-point" "最も高い地点" "ja")
(name-as-in "highest-point" "最高点" "zh-hans")
(name-as-in "highest-point" "" "zh-hant")

(descr-as-in "highest-point" "höchster Punkt in einem Land, einer Region oder Stadt" "de")
(descr-as-in "highest-point" "" "zh-hk")
(descr-as-in "highest-point" "" "zh-tw")
(descr-as-in "highest-point" "наивысшая точка в стране, регионе, городе или области" "ru")
(descr-as-in "highest-point" "" "pt")
(descr-as-in "highest-point" "point with highest elevation in the country, region, city or area" "en")
(descr-as-in "highest-point" "区域内的海拔最高点" "zh-cn")
(descr-as-in "highest-point" "point le plus élevé dans un pays, une région, une ville ou une zone géographique" "fr")
(descr-as-in "highest-point" "punto con mayor elevación en el país, región, ciudad o área" "es")
(descr-as-in "highest-point" "" "zh-sg")
(descr-as-in "highest-point" "国、地域、都市、地区で最も高い標高である地点" "ja")
(descr-as-in "highest-point" "" "zh-hans")
(descr-as-in "highest-point" "" "zh-hant")

