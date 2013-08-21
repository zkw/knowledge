(ns clazzes.college_town
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "college town")

(name-as-in "college town" "Universitätsstadt" "de")
(name-as-in "college town" "" "zh-hk")
(name-as-in "college town" "" "zh-tw")
(name-as-in "college town" "" "ru")
(name-as-in "college town" "" "pt")
(name-as-in "college town" "college town" "en")
(name-as-in "college town" "" "zh-cn")
(name-as-in "college town" "Ville universitaire" "fr")
(name-as-in "college town" "" "es")
(name-as-in "college town" "" "zh-sg")
(name-as-in "college town" "学術都市" "ja")
(name-as-in "college town" "" "zh-hans")
(name-as-in "college town" "" "zh-hant")

(descr-as-in "college town" "Stadt mit Sitz einer Universität" "de")
(descr-as-in "college town" "" "zh-hk")
(descr-as-in "college town" "" "zh-tw")
(descr-as-in "college town" "" "ru")
(descr-as-in "college town" "" "pt")
(descr-as-in "college town" "community dominated by its university population" "en")
(descr-as-in "college town" "" "zh-cn")
(descr-as-in "college town" "" "fr")
(descr-as-in "college town" "" "es")
(descr-as-in "college town" "" "zh-sg")
(descr-as-in "college town" "" "ja")
(descr-as-in "college town" "" "zh-hans")
(descr-as-in "college town" "" "zh-hant")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "college town" "main-type-gnd" "term")
