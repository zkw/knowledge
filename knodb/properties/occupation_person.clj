(ns properties.occupation_person
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "occupation-person")

(name-as-in "occupation-person" "職業" "zh-hant")
(name-as-in "occupation-person" "职业" "zh-hans")
(name-as-in "occupation-person" "профессия" "ru")
(name-as-in "occupation-person" "profissão" "pt")
(name-as-in "occupation-person" "profession" "fr")
(name-as-in "occupation-person" "ocupación (persona)" "es")
(name-as-in "occupation-person" "職業" "ja")
(name-as-in "occupation-person" "Tätigkeit (Person)" "de")
(name-as-in "occupation-person" "occupation (person)" "en")

(descr-as-in "occupation-person" "" "zh-hant")
(descr-as-in "occupation-person" "" "zh-hans")
(descr-as-in "occupation-person" "профессия персоны; см. также свойство область деятельности (Property:P101)" "ru")
(descr-as-in "occupation-person" "profissão de uma pessoa" "pt")
(descr-as-in "occupation-person" "métier ou occupation d'une personne, voir aussi domaine d'activité (Property:P101)" "fr")
(descr-as-in "occupation-person" "actividad laboral de la persona; véase también campo de trabajo (propiedad 101)" "es")
(descr-as-in "occupation-person" "人物の職業。「専門分野」(Property:P101) も参照" "ja")
(descr-as-in "occupation-person" "Beruf einer Person (ergänzt durch Arbeitsgebiet: Property:P101)" "de")
(descr-as-in "occupation-person" "occupation of a person; see also field of work (Property:P101)" "en")
