(ns clazzes.female
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "female")

(name-as-in "female" "女性" "zh-hant")
(name-as-in "female" "女性" "zh-hans")
(name-as-in "female" "женский" "ru")
(name-as-in "female" "feminino" "pt")
(name-as-in "female" "féminin" "fr")
(name-as-in "female" "femenino" "es")
(name-as-in "female" "女性" "ja")
(name-as-in "female" "weiblich" "de")
(name-as-in "female" "female" "en")

(descr-as-in "female" "性別為女的人（用於性別屬性P21）" "zh-hant")
(descr-as-in "female" "性别为女的人（用于性别属性P21）" "zh-hans")
(descr-as-in "female" "используется в свойстве P21 (пол человека)" "ru")
(descr-as-in "female" "a ser usado na Propriedade:P21 para indicar que o sujeito é do sexo feminino" "pt")
(descr-as-in "female" "élément à utiliser dans P21 pour signifier que la personne est de sexe féminin" "fr")
(descr-as-in "female" "elemento a usar en Property:P21 para indicar que la persona es de sexo femenino" "es")
(descr-as-in "female" "Property:P21 で主語が女性であると示すために用いられる" "ja")
(descr-as-in "female" "wird benutzt für die Eigenschaft: Geschlecht (P21) um anzuzeigen, dass die Person weiblich ist" "de")
(descr-as-in "female" "person who is a female (use with Property:P21 sex)" "en")


(refer-to ["properties.main_type_gnd"])
(refer-to ["clazzes.term"])
(fact claim "female" "main-type-gnd" "term")

(refer-to ["properties.subclass_of"])
(refer-to ["clazzes.female_animal"])
(fact claim "female" "subclass-of" "female animal")
(refer-to ["clazzes.person"])
(fact claim "female" "subclass-of" "person")

(refer-to ["properties.opposite_of"])
(refer-to ["clazzes.male"])
(fact claim "female" "opposite-of" "male")
