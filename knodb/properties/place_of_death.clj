(ns properties.place_of_death
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "place-of-death")

(name-as-in "place-of-death" "Sterbeort" "de")
(name-as-in "place-of-death" "" "zh-hk")
(name-as-in "place-of-death" "逝世地" "zh-tw")
(name-as-in "place-of-death" "место смерти" "ru")
(name-as-in "place-of-death" "local de falecimento" "pt")
(name-as-in "place-of-death" "place of death" "en")
(name-as-in "place-of-death" "逝世地点" "zh-cn")
(name-as-in "place-of-death" "lieu de décès" "fr")
(name-as-in "place-of-death" "lugar de fallecimiento" "es")
(name-as-in "place-of-death" "" "zh-sg")
(name-as-in "place-of-death" "死亡地" "ja")
(name-as-in "place-of-death" "逝世地" "zh-hans")
(name-as-in "place-of-death" "逝世地" "zh-hant")

(descr-as-in "place-of-death" "Ort, in dem ein Mensch gestorben ist" "de")
(descr-as-in "place-of-death" "" "zh-hk")
(descr-as-in "place-of-death" "" "zh-tw")
(descr-as-in "place-of-death" "" "ru")
(descr-as-in "place-of-death" "" "pt")
(descr-as-in "place-of-death" "the most specific known (e.g. city instead of country)" "en")
(descr-as-in "place-of-death" "" "zh-cn")
(descr-as-in "place-of-death" "lieu où la personne est morte la plus précise possible (ville au lieu de pays par exemple)" "fr")
(descr-as-in "place-of-death" "Sitio donde murió una persona. Usar el sitio más específico disponible." "es")
(descr-as-in "place-of-death" "" "zh-sg")
(descr-as-in "place-of-death" "最も詳細かつ知られた死亡地（例：国ではなく市）" "ja")
(descr-as-in "place-of-death" "" "zh-hans")
(descr-as-in "place-of-death" "" "zh-hant")

