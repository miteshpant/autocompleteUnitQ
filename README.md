# REST API Autocomplete application

This is a details of  REST API to autocomplete.

The entire application is ditributed in.

SERVICE-REGISTRY 
    Port: 8761
    Microservice to monitor all microservices in application.

CONFIG-SERVER
    Port: 9296
    Microservice to distribute shared configuration resources among other nicroservices

API-GATEWAY	
    Port: 9090
    API gateway to external users.

AUTOCOMPLETE-SERVICE
    Port: 9001
    Main service providing the API.

CACHING-SERVICE	
    Port: 9002
    Microservice aimed at providing caching for popularly used words. Not implemented in this release.

HYSTRIX-DASHBOARD
    Port: 9495
    Dashboard Microservice to monitor if the performance of main/fallback services


## Install

    Simple mvn dependency resolution for all mocroservices

## Run the app

    Start Microservices in the order listed above, no need to start caching and hystrix dashboard.
    AUTOCOMPLETE-SERVICE can work standalone provided the config server check is removed from bootstarp.yml

## Run the tests

    TODO

# REST API

The REST API to the autocomplete app is described below.

## Get suggested words

### Request

`GET http://localhost:9090/autocomplete/<word>`

    GET http://localhost:9090/autocomplete/ani

### Response

    ["aniridia","anicca","anicut","anicular","aniconic","aniconism","anisado","anisate","anisated","anisal","anisalcohol","anisaldehyde","anisaldoxime","anisamide","anisandrous","anisanthous","anisanilide","anischuria","anise","aniseroot","anises","anisette","anisettes","aniseed","aniseeds","aniseikonia","aniseikonic","aniselike","anisuria","anisum","anisic","anisidin","anisidine","anisidino","anisil","anisilic","anisyl","anisylidene","anis-","anisobranchiate","anisocarpic","anisocarpous","anisocratic","anisocercal","anisochromatic","anisochromia","anisocycle","anisocytosis","anisocoria","anisocotyledonous","anisocotyly","anisodactyl","anisodactyle","anisodactylic","anisodactylous","anisodont","anisogamete","anisogametes","anisogametic","anisogamy","anisogamic","anisogamous","anisogeny","anisogenous","anisogynous","anisognathism","anisognathous","anisoiconia","anisoin","anisokonia","anisol","anisole","anisoles","anisoleucocytosis","aniso-","anisomeric","anisomerous","anisometric","anisometrope","anisometropia","anisometropic","anisomelus","anisomelia","anisomyarian","anisomyodian","anisomyodous","anisopteran","anisopterous","anisopetalous","anisophylly","anisophyllous","anisopia","anisopleural","anisopleurous","anisopod","anisopodal","anisopodous","anisopogonous","anisospore","anisostaminous","anisostemonous","anisosthenic","anisostichous","anisostomous","anisosepalous","anisotropal","anisotrope","anisotropy","anisotropic","anisotropical","anisotropically","anisotropism","anisotropies","anisotropous","anisotonic","anisoyl","anidrosis","anidian","anidiomatic","anidiomatical","anitrogenous","anither","anitinstitutionalism","anitos","aniente","anientise","anigh","anight","anights","anilau","anilao","anils","anile","anileness","anilic","anilid","anilide","anilidic","anilidoxime","anility","anilities","aniliid","anilin","anilinctus","anilins","aniline","anilines","anilingus","anilinism","anilino","anilinophile","anilinophilous","anilla","anilopyrin","anilopyrine","anim","anima","animability","animable","animableness","animacule","animastic","animastical","animadversal","animadversive","animadversiveness","animadversion","animadversional","animadversions","animadvert","animadverts","animadverter","animadverted","animadverting","animate","animater","animaters","animates","animated","animatedly","animately","animateness","animatist","animatistic","animatism","animative","animating","animatingly","animation","animations","animato","animator","animators","animator's","animatograph","animal","animala","animalcula","animalcular","animalculae","animalcule","animalcules","animalculum","animalculist","animalculism","animalculine","animalculous","animals","animal's","animalhood","animalian","animalic","animalisation","animalist","animalistic","animalise","animalised","animalish","animalising","animalism","animality","animalities","animalier","animalivore","animalivorous","animalization","animalize","animalized","animalizing","animalillio","animally","animallike","animal-sized","animalness","animando","animant","anime","animes","animetta","animus","animuses","animi","animis","animist","animists","animistic","animism","animisms","animize","animized","animikite","animine","anim.","animo","animose","animoseness","animosity","animosities","animoso","animotheism","animous","anion","anions","anion's","anionic","anionically","anionics"]





