(ns entities.swiss_literary_archives
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Geographical-feature "Swiss Literary Archives")

(name-as-in "Swiss Literary Archives" "" "zh-hant")
(name-as-in "Swiss Literary Archives" "" "zh-hans")
(name-as-in "Swiss Literary Archives" "Швейцарский литературный архив" "ru")
(name-as-in "Swiss Literary Archives" "" "pt")
(name-as-in "Swiss Literary Archives" "Archives littéraires suisses" "fr")
(name-as-in "Swiss Literary Archives" "" "es")
(name-as-in "Swiss Literary Archives" "" "ja")
(name-as-in "Swiss Literary Archives" "Schweizerisches Literaturarchiv" "de")
(name-as-in "Swiss Literary Archives" "Swiss Literary Archives" "en")

(descr-as-in "Swiss Literary Archives" "" "zh-hant")
(descr-as-in "Swiss Literary Archives" "" "zh-hans")
(descr-as-in "Swiss Literary Archives" "" "ru")
(descr-as-in "Swiss Literary Archives" "" "pt")
(descr-as-in "Swiss Literary Archives" "" "fr")
(descr-as-in "Swiss Literary Archives" "" "es")
(descr-as-in "Swiss Literary Archives" "" "ja")
(descr-as-in "Swiss Literary Archives" "" "de")
(descr-as-in "Swiss Literary Archives" "" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.geographical_feature"])
(fact claim "Swiss Literary Archives" "main-type-gnd" "geographical feature")

(refer-to ["properties.country"])
(refer-to ["entities.switzerland"])
(fact claim "Swiss Literary Archives" "country" "Switzerland")

(refer-to ["properties.is_in_the_administrative_unit"])
(refer-to ["entities.bern"])
(fact claim "Swiss Literary Archives" "is-in-the-administrative-unit" "Bern")
(refer-to ["entities.canton_of_bern"])
(fact claim "Swiss Literary Archives" "is-in-the-administrative-unit" "Canton of Bern")

(refer-to ["properties.pcp_reference_number"])
(fact claim "Swiss Literary Archives" "pcp-reference-number" "8835")

(refer-to ["properties.instance_of"])
(refer-to ["clazzes.cultural_property"])
(fact claim "Swiss Literary Archives" "instance-of" "cultural property")
