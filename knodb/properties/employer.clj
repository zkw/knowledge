(ns properties.employer
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "employer")

(name-as-in "employer" "受僱於" "zh-hant")
(name-as-in "employer" "受雇于" "zh-hans")
(name-as-in "employer" "работает в" "ru")
(name-as-in "employer" "empregador" "pt")
(name-as-in "employer" "employeur" "fr")
(name-as-in "employer" "empleador" "es")
(name-as-in "employer" "雇用者" "ja")
(name-as-in "employer" "Arbeitgeber" "de")
(name-as-in "employer" "employer" "en")

(descr-as-in "employer" "" "zh-hant")
(descr-as-in "employer" "" "zh-hans")
(descr-as-in "employer" "" "ru")
(descr-as-in "employer" "organização para qual o sujeito trabalha ou trabalhou" "pt")
(descr-as-in "employer" "organisation pour laquelle le sujet travaille ou a travaillé" "fr")
(descr-as-in "employer" "organización para la cual trabaja o trabajó" "es")
(descr-as-in "employer" "項目の人物を雇用している・していた組織" "ja")
(descr-as-in "employer" "früherer oder aktueller Arbeitgeber einer Person" "de")
(descr-as-in "employer" "organization for which the subject works or worked" "en")

