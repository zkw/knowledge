(ns clazzes.max_planck_medal
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Max Planck Medal")

(name-as-in "Max Planck Medal" "馬克斯·普朗克獎章" "zh-hant")
(name-as-in "Max Planck Medal" "马克斯·普朗克奖章" "zh-hans")
(name-as-in "Max Planck Medal" "Медаль имени Макса Планка" "ru")
(name-as-in "Max Planck Medal" "Medalha Max Planck" "pt")
(name-as-in "Max Planck Medal" "Médaille Max Planck" "fr")
(name-as-in "Max Planck Medal" "Medalla Max Planck" "es")
(name-as-in "Max Planck Medal" "マックス・プランク・メダル" "ja")
(name-as-in "Max Planck Medal" "Max-Planck-Medaille" "de")
(name-as-in "Max Planck Medal" "Max Planck Medal" "en")

(descr-as-in "Max Planck Medal" "" "zh-hant")
(descr-as-in "Max Planck Medal" "" "zh-hans")
(descr-as-in "Max Planck Medal" "" "ru")
(descr-as-in "Max Planck Medal" "" "pt")
(descr-as-in "Max Planck Medal" "" "fr")
(descr-as-in "Max Planck Medal" "" "es")
(descr-as-in "Max Planck Medal" "" "ja")
(descr-as-in "Max Planck Medal" "Wissenschaftspreis" "de")
(descr-as-in "Max Planck Medal" "science award" "en")


(refer-to ["properties.named_after"])
(refer-to ["entities.max_planck"])
(fact claim "Max Planck Medal" "named-after" "Max Planck")
