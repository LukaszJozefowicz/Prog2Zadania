# Prog2Zadania

Zadanie 1!  Wyznaczanie daty Wielkanocy Przed przystąpieniem do zadań przeczytaj poniższy tekst, następnie wykonaj ćwiczenia a-e.  
Wielkanoc jest tak zwanym świętem ruchomym - oznacza to, że każdego roku występuje w inny dzień. Definicja mówi, iż przypada ona w pierwszą niedzielę po pierwszej pełni Księżyca przypadającej po równonocy wiosennej. W 1991 roku Jean Meeus opublikował sposób na obliczanie daty Wielkanocy.   
Aby obliczyć datę Wielkanocy: 
• Tworzymy zmienne a, b, c, d, e, f, g, h, i, k, l, m, p, zmienną przechowującą podany przez użytkownika rok, a także obliczony dzień i miesiąc • Pobieramy rok od użytkownika • Za a podstaw resztę z dzielenia rok przez 19 • Za b podstaw zaokrąglony w dół wynik dzielenia roku przez 100 • Za c podstaw resztę z dzielenia roku przez 100 • Za d podstaw zaokrąglony w dół wynik dzielenia b przez 4 • Za e podstaw resztę z dzielenia b przez 4 • Za f podstaw zaokrąglony w dół wynik działania ((b + 8) / 25) • Za g podstaw zaokrąglony w dół wynik działania ((b – f + 1) / 3) • Za h podstaw resztę z dzielenia przez 30 wyrażenia (19 * a + b – d – g + 15) • Za i podstaw zaokrąglony w dół wynik dzielenia c przez 4 • Za k podstaw resztę z dzielenia c przez 4 • Za l podstaw resztę z dzielenia przez 7 wyrażenia (32 + 2 * e + 2 * i – h – k) • Za m podstaw zaokrąglony w dół wynik dzielenia przez 451 wyrażenia  (a + 11 * h + 22 * l) • Za p podstaw resztę z dzielenia przez 31 wyrażenia (h + l – 7 * m + 114) 
Aby wyznaczyć dzień Wielkanocy do p należy dodać 1, z kolei do wyznaczania miesiąca trzeba zaokrąglając w dół podzielić (h + l – 7 * m + 114) przez 31. Jeżeli miesiąc wyszedł nam 4, wówczas Wielkanoc odbędzie się w kwietniu. W każdym innym przypadku w marcu. 
a) Jakie działanie zwraca resztę z dzielenia? Czy wiesz jakim symbolem oznaczamy je w Javie? b) Jakiego typu podstawowego zmiennych użyjesz do implementacji?  c) W niektórych punktach algorytmu należy zaokrąglić wynik w dół z dzielenia. W jaki sposób możesz to zrobić? Czy potrzebujesz do tego specjalnej metody? d) Przy pomocy jakiej klasy możesz pobrać od użytkownika rok? Jakie znasz inne metody wprowadzania danych do aplikacji (niekoniecznie przy pomocy klawiatury)? e) Przystąp do implementacji algorytmu. Przed rozpoczęciem pracy spróbuj rozpisać każde działanie na kartce. Na wyjściu zwróć datę w formacie DD miesiąc RRRR np. dla roku 2015 Twój program powinien zwrócić 5 kwiecień 2015. 
  
Zadanie 2 Biedny Camel Case Przed przystąpieniem do zadań przeczytaj poniższy tekst, następnie wykonaj ćwiczenia a-b.  
CamelCase jest konwencją notacji przyjętą w wielu językach programowania, takich jak Java i C#, gdzie służy do zapisu nazw zmiennych, procedur, klas, itp. Nazwa notacji camelCase wywodzi się z faktu, że przy jej zastosowaniu wielkie litery w połączonych ze sobą słowach przypominają kształtem garby wielbłąda (ang. camel). Konwencja ta została najprawdopodobniej użyta po raz pierwszy w języku programowania Smalltalk. W latach 90-00 modne było tworzenie opisów w GG przy pomocy notacji przypominającej CamelCase – jedna litera duża, druga mała np. JaK sIe CiEsZe (Jak się cieszę).   
a) Zaimplementuj algorytm, który dla wprowadzonego przez użytkownika ciągu znaków zwróci mu biednego CamelCase zgodnie z przykładem w tekście. Załóż, że program będzie wczytywał polskie znaki, jednak zamieni je na ich „bezogonkowy” odpowiednik, a spacja nie jest liczona jako litera (jest przepisywana).  b) *Zastanów się czy jesteś w stanie „w locie” czytając znak po znaku ze źródła przekształcać podany ciąg, aby zwracany był biedny CamelCase.  
  
Zadanie 3 Spacje CamelCase W celu zaoszczędzenia ilości znaków w krótkich wiadomościach tekstowych (SMS) nie pisze się spacji, a każdy wyraz rozpoczyna się wielką literą. Twoim zadaniem jest otrzymany tekst przerobić zgodnie z powyższym trendem. 
Wejście Na wejściu znajduje się dowolny tekst bez polskich znaków.  
Wyjście Tekst wprowadzony z wejścia, ale bez spacji. Ponadto każdy wyraz poprzedzony na wejściu spacją zaczyna się wielką literą. 
Przykład Input: 
Dzisiaj jest czwartek, A jutro bedzie piatek.  
Output: 
DzisiajJestCzwartek, AJutroBedziePiatek.  
Zadanie 4 Spacje CamelCase odwrotność W celu zaoszczędzenia ilości znaków w krótkich wiadomościach tekstowych (SMS) nie pisze się spacji, a każdy wyraz rozpoczyna się wielką literą. Twoim zadaniem jest odkodować otrzymany tekst i przerobić tak, aby z wersji bez spacji otrzymać normalny tekst (wyrazy nie rozpoczynające zdanie mają zostać zapisane z małej litery). Załóż, że pojedyncze zdanie znajduje się w pojedynczej linii.  
Wejście Na wejściu znajduje się dowolny tekst bez polskich znaków pozbawiony spacji.  
Wyjście 
Tekst wprowadzony z wejścia ze spacjami.  
Przykład Input: 
DzisiajJestCzwartek, AJutroBedziePiatek.  
Output: 
Dzisiaj jest czwartek, A jutro bedzie piatek.  
  
Zadanie 5 Dzień tygodnia Dni tygodnia będziemy oznaczać skrótami: Pn, Wt, Sr, Czw, Pt, Sb, Nd. 
Wejście 
Przypadek składa się ze skrótu dnia tygodnia i liczby n (1 ≤ n ≤ 109).  
Wyjście Skrót dnia tygodnia, który nastąpi za n dni licząc od dnia tygodnia podanego na wejściu.  
Przykład Input: 
Czw 1 Output: 
Pt  
  
Zadanie 6 Bajtockie święto trójkąta W Bajtocji, jak co roku, zorganizowano "Święto Trójkąta". Z tej okazji wiele dzieci bierze udział w zabawie na Placu Ministerstwa Matematyki. Zabawa polega na tym, że każde dziecko losuje w Specjalnej Maszynie Losującej trzy liczby całkowite z zakresu od 10 do 200, a następnie rysuje kredą na placu trójkąt o bokach takiej długości (w centymetrach), jak wylosowane liczby. Każdy uczestnik zabawy wywiązuje się z zadania bezbłędnie i, jeśli jest to wykonywalne, rysuje idealnie swój trójkąt (żeby nie było wątpliwości - wypełniony). Możemy być też pewni, że miejsca na placu nie zabraknie.  Znając wylosowane liczby i średnie zużycie kredy na metr kwadratowy wypełnionej powierzchni placu oblicz, ile kredy zużyto podczas zabawy. 
Wejście Pierwsza linia wejścia zawiera liczbę przypadków testowych t (t≤10). Pierwsza linia każdego testu zawiera dwie liczby n i k. Odpowiednio: liczbę uczestników zabawy (n≤103) oraz średnie zużycie kredy k w kg/m2 (k≤10). W kolejnych n liniach podane są po trzy liczby całkowite a, b i c - liczby wylosowane przez kolejnych uczestników. 
Wyjście Dla każdego przypadku testowego, w oddzielnej linii, całkowite zużycie kredy w gramach, w zaokrągleniu do najbliższej liczby całkowitej. 
Przykład Input: 
2 2 1 30 40 50 20 20 20 1 0.5 70  22 33 Output: 
77 0   
  
Zadanie 7 Imieniny Jasia Jaś ma pojutrze imieniny. Jak dla każdego małego chłopca, jest to bardzo miły dzień w jego życiu. Na pewno dostanie mnóstwo prezentów, słodkości i innych pyszności. Jednak Jaś chodzi do szkoły, a jego imieniny wypadają akurat w dzień, który żadnym świętem nie jest i musi do niej pójść. Nie to jednak jest w tym najgorsze, że trzeba tam iść, zamiast cały dzień świętować objadając się pysznościami przygotowanymi przez mamę. Najgorsze jest to, że jak każdy inny mały chłopiec w szkole, Jaś musi rozdać swoim kolegom i koleżankom cukierki w czasie jednej z lekcji. Jest to zadanie, którego Jaś szalenie wręcz nie lubi. Jednak nie może nic z tym zrobić – taka jest tradycja, a nie chce okłamywać mamy, że rozdał cukierki, naprawdę ich nie rozdając. Zresztą... wstyd przed całą klasą – mieć imieniny i nie mieć cukierków – nie, nie, absolutnie nie wchodzi to w grę. Mama już zakupiła odpowiednią ilość cukierków. Ponieważ ich rozdawanie jest ogromnie ważne, mama już dziś położyła cukierki tuż przy plecaku Jasia w jego pokoju, aby na pewno ich nie zapomniał. A tymczasem on nie może przez to spać. Cukierki, przypominając zapachem o swojej obecności, przywołują u Jasia strasznie niemiłe wspomnienia zeszłorocznych imienin i cukierków w klasie, kiedy na oczach całej podśmiechującej się klasy musiał się całować z panią nauczycielką... Jaś postanowił odpędzić złe myśli zabijając w jakiś sposób czas. Wziął torebkę z cukierkami i postanowił je policzyć. Policzył jednak bardzo szybko i znów złe myśli przyszły mu do głowy. Zdecydował więc, że musi się dowiedzieć, czy w tym roku też zostaną dla niego cukierki, jak w zeszłym, czy może tym razem mama się poprawiła w obliczeniach. Jaś wiedział, ile w jego klasie jest osób i wiedział, że nie może nikogo wyróżnić – każdy musi dostać taką samą liczbę cukierków, oprócz niego samego, który nie je ich wtedy w szkole. Był dobrym kolegą, więc każdemu chciał dać jak najwięcej. Jednak, jeśli nie dało się rozdać w taki sposób wszystkich cukierków, te które zostały Jaś brał z powrotem do domu i mógł sam je zjeść. Obliczenie, czy coś mu zostanie było ponad jego siły, biednego, małego chłopca. Poprosił więc Ciebie o pomoc. Wiedząc, ile osób liczy klasa Jasia oraz ile cukierków kupiła mama oblicz, czy po ich rozdaniu wśród kolegów i koleżanek Jasia, zostanie jeszcze coś dla niego na wieczór, a jeżeli tak to ile. 
Wejście Wejście składa się z dwóch liczb całkowitych L i C (1 ≤ L, C ≤ 109) oznaczających odpowiednio liczbę osób w klasie Jasia oraz liczbę cukierków, które kupiła mama. 
Wyjście Należy wypisać w osobnej linii słowo TAK oraz liczbę cukierków, jeśli coś dla Jasia zostanie lub NIE, jeśli rozda on dokładnie wszystkie cukierki. 
Przykład Input: 3 2 Output: NIE Input: 55 22 Output: TAK, 13 
  
Zadanie 8 Tagi HTMLowe Często się zdarza, że pisząc stronę internetową piszemy tagi HTMLowe w postaci dużych, a czasami małych liter. Powoduje, że kod strony wygląda nieestetycznie. Twoim zadanie jest napisanie programu, który przerobi wszystkie tagi HTMLowe na duże litery, tzn, wszystkie litery pomiędzy znakami "<" a ">" zamieni na duże litery. 
Wejście W pliku wejścioweym znajduje się fragment kodu HTMLowego. 
Wyjście 
Na wyjściu znajduje się kod HTML z wejścia, tyle tylko, że wszystkie tagi HTMLowe składają się z dużych liter. 
Przykład Input: 
<html> <head> <TITLE>To jest tytul</Title> </head> <body> <b>Cos tam</b> </body> </html> Output: 
<HTML> <HEAD> <TITLE>To jest tytul</TITLE> </HEAD> <BODY> <B>Cos tam</B> </BODY> </HTML>  
  
Zadanie 9 Weryfikacja dowodu osobistego Na podstawie poniższego tekstu zaimplementuj algorytm weryfikujący poprawność dowodu osobistego  Obowiązujący (…) wzór dowodu osobistego został określony rozporządzeniem Rady Ministrów (…). Obecny wzór określa rozporządzenie Ministra Spraw Wewnętrznych z dnia 29 stycznia 2015 r. w sprawie wzoru dowodu osobistego oraz sposobu i trybu postępowania w sprawach wydawania dowodów osobistych, ich utraty, uszkodzenia, unieważnienia i zwrotu. Dokument ma postać wielowarstwowej karty poliwęglanowej (…), zawierającej podstawowe informacje o jej posiadaczu, dacie wydania, organie wydającym i terminie ważności. Informacje zapisane są zarówno w sposób jawny, jak i zakodowany. Dowód osobisty jest jednocześnie dokumentem uprawniającym obywateli polskich do przekraczania granic państw członkowskich Unii Europejskiej, państw Europejskiego Obszaru Gospodarczego nienależących do Unii Europejskiej oraz państw niebędących stronami umowy o Europejskim Obszarze Gospodarczym, których obywatele mogą korzystać ze swobody przepływu osób na podstawie umów zawartych przez te państwa ze Wspólnotą Europejską i jej państwami członkowskimi, uznających ten dokument za wystarczający do przekraczania ich granicy. Od listopada 2013 roku został wprowadzony do obiegu zmodyfikowany dowód osobisty. Dokument powstał na bazie poprzedniego wzoru dowodu. Modyfikacja nie spowodowała zmiany wzoru dokumentu, jednak wprowadzono kilka zmian w zabezpieczeniach. Nowe dokumenty rozpoczynają się serią AXI od numeru x00001. Numer „plastikowego” dowodu osobistego składa się z trzech liter i sześciu cyfr, z których jedna (pierwsza cyfra) to cyfra kontrolna.  
Aby sprawdzić poprawność numeru i serii dowodu, należy najpierw zamienić litery na liczby, przypisując literom odpowiednio:        
Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3. Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).   
  
A B C D E F G H I J K L M N 10 11 12 13 14 15 16 17 18 19 20 21 22 23 O P Q R S T U V W X Y Z   24 25 26 27 28 29 30 31 32 33 34 35   
Zadanie 10 ! Największy wspólny dzielnik (NWD) Na podstawie schematu blokowego algorytmu napisz program wyliczający NWD.    
  
Zadanie 11 ! Najmniejsza wspólna wielokrotność (NWW) Przed przystąpieniem do rozwiązywania tego zadania upewnij się, że poprawnie i starannie rozwiązałaś/eś zadanie 4. Korzystając z tego zadania zaimplementuj algorytm, którego skrócony opis znajduje się poniżej.   
Najmniejsza wspólna wielokrotność (NWW) dwóch lub więcej liczb naturalnych  a1, a2, a3, ..., an - to najmniejsza liczba naturalna której dzielnikiem jest każda z liczb  a1, a2, a3, …, an. Najprostszą metodą obliczania NWW jest wykorzystanie algorytmu na obliczanie największego wspólnego dzielnika (NWD).  NWW(a1,a2)= a1∗ a2 NWD(a1,a2) Przykład Obliczamy NWW liczb 9 i 12. NWW(9,12)= 9∗12 NWD(9,12) NWW(9,12)=108 3 NWW (9,12)=36 Zatem najmniejszą wspólną wielokrotnością liczb 9 oraz 12 jest 36.   
Zadanie 12 Weryfikacja numeru PESEL Na podstawie poniższego tekstu zaimplementuj algorytm weryfikujący numer PESEL.  
Jan Kowalski musi wpisać do systemu szpitalnego dane osobowe pacjenta, oprócz imienia i nazwiska musi również wpisać PESEL pacjenta. Jakież było jego zdziwienie, gdy spostrzegł, że pewnych pacjentów system nie przyjmował z powodu wadliwego PESELu.  
Aby sprawdzić czy dany PESEL jest prawidłowy należy wykonać następujące działania: • Pierwszą cyfrę mnożymy przez 1, • drugą cyfrę mnożymy przez 3, • trzecią cyfrę mnożymy przez 7, • czwarta cyfrę mnożymy przez 9, • piątą cyfrę mnożymy przez 1, • szóstą cyfrę mnożymy przez 3, • siódmą cyfrę mnożymy przez 7, • ósmą cyfrę mnożymy przez 9, • dziewiątą cyfrę mnożymy przez 1, • dziesiątą cyfrę mnożymy przez 3, • jedenastą cyfrę mnożymy przez 1.  
Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458  
4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 =  = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110.  
  
Zadanie 13* Ciążowy specjalista Przeczytaj poniższy tekst, następnie wykonaj polecenia a i b.  
W pewnym małym miasteczku rozchorowała się nauczycielka biologii. Dla tak małego miasteczka okazało się to ogromnie wielkim problemem. W okolicy nie było nikogo kto mógłby i chciałby zastąpić nauczycielkę ucząc dzieci w podstawówce biologii. Zwłaszcza, że akurat zgodnie z programem trzeba by zacząć przerabiać bardzo trudne tematy dotyczące rozmnażania zwierząt. Ponieważ nie było chętnych, dyrektor zadecydował, że dopóki nauczycielka nie wróci do szkoły, lekcje biologii będzie przeprowadzał nauczyciel matematyki. Mimo iż był on temu bardzo niechętny, nie mógł odmówić swojemu dyrektorowi. Na pierwszej lekcji, którą miał przeprowadzić zgodnie z programem nauczania, powinien powiedzieć o tym, jak różnorodne mogą być długości ciąży u ssaków. Tak się akurat składało, że dzień wcześniej jego kolega, matematyk z dużego miasta, przesłał mu mejlem taką zagadkę: Matka jest o 21 lat starsza od swojego dziecka. Za 6 lat dziecko będzie 5 razy młodsze od matki. Pytanie: Gdzie jest ojciec? Rozwiązując tę zagadkę matematyk spostrzegł, że obliczył bez problemu moment poczęcia (chwila obecna) i urodzenia dziecka, czyli poznał długość trwania ciąży człowieka. Wpadł więc na doskonały pomysł, aby tylko modyﬁkować dane tego zadania, podstawiając odpowiednie gatunki zwierząt i w ten sposób, uczyć bawiąc, pozwolić uczniom na poznanie długości trwania ciąży różnych zwierząt. Niestety uczniowie okazali się mniej entuzjastycznie nastawieni do zagadki, a pomysł rozwiązywania łamigłówek matematycznych nie tylko na matematyce, ale także na lekcjach biologii, wydał im się mało traﬁony.   
a) Spróbuj rozwiązać zagadkę matematyka manualnie – na kartce, do sprawdzania poprawności swojego rozumowania możesz wykorzystać przykładowe dane. b) Dla danego gatunku zwierząt znając różnicę wieku między matką, a dzieckiem oraz wiedząc, kiedy dziecko będzie ile razy młodsze od matki, ustal długość trwania ciąży. Innymi słowy – napisz program, który pomoże uczniom rozwiązać zagadki.  
Wejście Pierwsza linia wejścia zawiera liczbę całkowitą D (1 ≤ D ≤ 500) oznaczającą liczbę zestawów danych. Każdy zestaw znajduje się w osobnej linii i składa się z 3 liczb całkowitych X, Y, Z (1 ≤ X, Y, Z ≤ 1000, Z > 1). Po ich podstawieniu do zagadki brzmi ona następująco: "Matka jest o X lat starsza od swojego dziecka. Za Y lat dziecko będzie Z razy młodsze od matki." 
Wyjście Dla każdego zestawu danych należy wypisać w osobnej linii jedną liczbę – długość trwania ciąży badanego gatunku zwierząt. Aby trzymać się standardów biologicznych, długość ta powinna być wyrażona w liczbie miesięcy, które trwa ciąża. Ponieważ biologów nie interesują dokładne wartości ułamkowe, a wszystko jest zaokrąglane, ty także musisz zaokrąglić swój wynik do najbliższej liczby całkowitej i wypisać go na wyjście. Uwaga: Zakładamy, że nauczyciel obliczył wcześniej sam wszystkie zadania i każde dane dają prawidłowy wynik, tzn. można na ich podstawie wyliczyć długość ciąży, która jest zawsze pewną dodatnią wartością (co oczywiście nie musi oznaczać, że wyjście musi być zawsze dodatnie). 
Przykład Wejście: 3 21      6     5  
11      1     13 223    2     113 Wyjście: 9 1 0  
  
Zadanie 14 Przeprowadzka Przeczytaj poniższy tekst, następnie wykonaj polecenia a i b. Bajteusz jest wielkim fanem Eulera. Kolekcjonuje wszystkie przedmioty związane ze swoim idolem. Oprócz wszystkich jego prac jest on w posiadaniu niewyobrażalnej ilości rzeczy osobistych wielkiego matematyka - od marynarki po jego szczoteczkę do zębów. Ostatnio Bajteusz wygrał mieszkanie w konkursie na zapamiętanie i odtworzenie największej ilości grafów planarnych. Pozostało się zatem przeprowadzić, a co za tym idzie spakować do pudełek wszystkie eksponaty z kolekcji. Na szczęście Bajteusz ma kolegę w fabryce pudełek, więc ma ich do dyspozycji nawet do 2.37*∞. Jednak nie chcąc niepotrzebnie wykorzystywać znajomego, Bajteusz postanowił zużyć ich jak najmniej. Dodatkowo, w jednym z nich mogą znajdować się maksymalnie 2 eksponaty - przy większej ilości coś może się uszkodzić. Pomóż Bajteuszowi pisząc program, który obliczy minimalną ilość pudełek potrzebnych do spakowania wszystkich jego skarbów. 
Wejście W pierwszej linii wejścia znajduje się liczba testów t (t<1001). Każdy test składa się z kolei z dwóch wierszy: w pierwszym dwie liczby n i k (n≤106, k<1001) oznaczające odpowiednio ilość eksponatów w kolekcji Bajteusza oraz maksymalną pojemność pudełka. W drugim natomiast n liczb z przedziału 1..k, oznaczających wagi kolejnych przedmiotów. 
Wyjście Dla każdego testu jedna linia zawierająca minimalną ilość pudełek potrzebnych do spakowania całej kolekcji Bajteusza. 
Przykład Wejście: 1 7   20  4   10  18   6   16   20  13 Wyjście: 5  
  
Zadanie 15 ! Odwrotna notacja polska Przeczytaj poniższy opis algorytmu, następnie spróbuj go zaimplementować. Zadanie spróbuj rozwiązać po dokładnym omówieniu stosów.  
Odwrotną notację polską ONP (ang. RPN – Reverse Polish Notation), zwana często również notacją Postfix, wymyślono w celu zapisywania dowolnych wyrażeń arytmetycznych bez nawiasów. W normalnym zapisie arytmetycznym operatory znajdują się pomiędzy argumentami: 2 + 2     6 - 4     3 * 5     12 / 3 Operatory posiadają priorytety, czyli "ważność" oraz łączność w prawo lub w lewo. Jeśli w wyrażeniu wystąpią operatory o różnych priorytetach, to najpierw zostaną wykonane te ważniejsze: 3 + 5 * 2 = 3 + 10 = 13 Jeśli chcemy zmienić kolejność wykonywania działań, musimy używać nawiasów: (3 + 5) * 2 = 8 * 2 = 16 W ONP problem ten nie występuje. Operator zawsze występuje po swoich argumentach: 2 2 +     6 4 -     3 5 *     12 3 / Dzięki tej prostej zasadzie nawiasy stają się zbędne: 3 + 5 * 2 → 3 5 2 * + = 3 10 + = 13 (3 + 5) * 2 → 3 5 + 2 * = 8 2 * = 16   
Do obliczenia wartości wyrażenia zapisanego w ONP potrzebujemy stosu. Zasada jest następująca: Wyrażenie ONP przeglądamy od strony lewej do prawej. Jeśli napotkamy liczbę, to umieszczamy ją na stosie. Jeśli napotkamy operator, to ze stosu pobieramy dwie ostatnie liczby, wykonujemy na nich działanie zgodne z napotkanym operatorem i wynik umieszczamy z powrotem na stosie. Gdy wyrażenie zostanie przeglądnięte do końca, na szczycie stosu będzie znajdował się jego wynik.  
Wyrażenie ONP Element Operacja Stos 
 3  5  2  *  +     --- 
 3  5  2  *  +  3  na stos 
3 --- 
 3  5  2  *  +  5  na stos 
5 3 --- 
 3  5  2  *  +  2  na stos 
2 5 3 --- 
 3  5  2  *  +  *  
pobierz 2 i 5 mnóż 5 * 2 wynik na stos 
10 3 --- 
 3  5  2  *  +  +  
pobierz 10 i 3 dodaj 3 + 10 wynik na stos 
13 ---  
Notacja ONP jest szeroko wykorzystywana w kompilatorach języków wysokiego poziomu. Istnieją również języki, które do obliczeń stosują jedynie ONP – np. Forth. Przed przystąpieniem do zaprojektowania algorytmu ONP musimy poczynić pewne ustalenia. Dla prostoty umawiamy się, że używać będziemy tylko czterech operatorów arytmetycznych: 
• + – dodawanie • - – odejmowanie • * – mnożenie • / – dzielenie 
Wyrażenie musi być poprawne – algorytm nie sprawdza jego poprawności. Każdy element będzie wprowadzany w osobnym wierszu – w ten sposób pozbędziemy się problemu analizowania tekstu pod kątem zawartości w nim liczb i operatorów. W rzeczywistości wyrażenie zawarte w wierszu zostałoby najpierw rozbite na elementy składowe – liczby i operatory – a następnie elementy te zostałyby użyte do obliczenia wartości wyrażenia wg naszego algorytmu. Liczby muszą mieć postać akceptowaną przez dany język programowania. Ostatnim elementem wyrażenia jest znak "=". Powoduje on zakończenie obliczeń i wyprowadzenie wyniku ze stosu. W algorytmie będziemy musieli rozpoznawać, czy wprowadzony element jest liczbą, czy też operatorem lub znakiem "=".  Wejście: 
S  –  stos liczb zmiennoprzecinkowych Wyjście: 
Wartość wyrażenia ONP na szczycie stosu S Elementy pomocnicze: 
e  – przechowuje odczytaną informację z wejścia jako łańcuch tekstowy v1, v2  –  przechowują argumenty operacji Lista kroków: 
K01: Czytaj e // odczytujemy kolejne elementy wyrażenia ONP K02: Jeśli e = "=", to zakończ // znak = kończy wyrażenie ONP K03: Jeśli e jest liczbą, to idź do K09 // liczby umieszczamy na stosie K04: v2←S.top() S.pop() //  pobieramy ze stosu argumenty operacji K05: v1←S.top() S.pop()   
K06: Wykonaj operację na v1 i v2 zgodnie z zawartością e. Wynik umieść w v1 
// wykonujemy obliczenia zgodnie ze zn operatora  
K07: S.push(v1) // wynik trafia na stos K08: Idź do K01 // kontynuujemy przetwarzanie wyrażenia K09: Przekształć e na liczbę w v1   K10: Idź do K07 // liczbę umieszczamy na stosie  
  
Zadanie 16 Piramidy  Przeczytaj poniższy opis zagadki i zaimplementuj algorytm. Spróbuj go zaimplementować po omówieniu drzew. Kuba zainspirowany egipskimi piramidami postanowił zbudować swoje. Ma w swoim domu bardzo dużo klocków o wymiarach 1x1xK (dla dowolnie dużego K). Jego pomysł na piramidę wygląda następująco: najdłuższy klocek leży na samym dole, według tej zasady, kolejne mniejsze piramidki mogą być zbudowane na niższym klocku. Odległość sąsiednich klocków od siebie powinna wynosić 1 oraz odległość klocków, a krawędzią podstawy, na której leżą także powinna wynosić 1. Na czubku każdej wieży musi znajdować się klocek o długości 1. PRK bardzo szybko ową zasadę przerobił na pojęcie informatyczne, a konkretniej ukorzenione drzew:    
Korzeń drzewa jest podstawą budowli, łączy się się ona z kolejnymi blokami, a liśćmi są klocki o wymiarach 1x1x1.   Znając tylko strukturę drzewa, jaka jest całkowita objętość oryginalnej budowli? Załóż, że korzeń drzewa to wierzchołek o indeksie 0.  
Wejście Każdy test składa się z następującego opisu: W pierwszym wierszu liczba N (1 <= N <= 1000) oznaczająca liczbę wierzchołków drzewa. W kolejnych N-1 wierszach po dwie liczby a, b ( 0 <= a, b < N) oznaczające połączenie między tymi dwoma wierzchołkami.  
Wyjście Objętość danej piramidy. 
Przykład Wejście: 3 1   2 1   0  Wyjście: 9   
  
Zadanie 17: Przedszkolanka W ostatnim czasie przedszkole opanowała nietypowa epidemia. Nie dotknęła ona przedszkolaków, tylko panie opiekujące się dziećmi. Pośród nielicznych zdrowych pozostała, ulubiona przez wszystkie maluchy, pani Agnieszka. Postanowiła osłodzić podopiecznym nieobecność wychowawczyń i rozdać im trochę cukierków. Przedszkolanka wie, że następnego dnia będzie się zajmowała jedną z dwóch grup. Zna też liczbę dzieci w każdej z nich. Chce teraz dobrać taką liczbę słodyczy, by można nią było obdarować wszystkie dzieci, niezależnie od grupy, którą będzie prowadziła. Musi przy tym spełnić kilka warunków. Po pierwsze, każdy z przedszkolaków powinien otrzymać jednakową (oczywiście niezerową) liczbę cukierków. Po drugie, liczba słodyczy powinna być taka, by można było rozdać je wszystkie. Po trzecie, ponieważ budżet przedszkola jest ograniczony, pani Agnieszka musi kupić minimalną liczbę cukierków spełniającą dwa wcześniejsze warunki. Pomóż sympatycznej przedszkolance i napisz program, który obliczy, ile cukierków powinna kupić.  
Wejście W pierwszym i jedynym wierszu zestawu danych znajdują się dwie liczby całkowite a i b (10<=a,b<=30), oddzielone pojedynczą spacją, oznaczające odpowiednio liczbę przedszkolaków w grupach, z których jedna zostanie przydzielona pani Agnieszce. 
Wyjście Wyniki programu powinny być wypisywane na standardowe wyjście. W kolejnych wierszach należy podać odpowiedzi obliczone dla kolejnych zestawów danych. Wynikiem dla jednego zestawu jest liczba cukierków, jaką powinna zakupić przedszkolanka.  
Przykład Dla danych wejściowych: 12  15 
prawidłowym rozwiązaniem jest:  
60 
   
Zadania domowe Poniżej będą dodawane zadania, które możesz zaimplementować w wolnej chwili. W razie problemów z implementacją zapraszam do kontaktu, a także dyskusji na konsultacjach bądź zajęciach.   

Zadanie 1: Palindromy w liczbach Piotruś w klasie na lekcji matematyki bardzo się nudził i pani postanowiła dać mu dodatkowe zadanie do rozwiązania. Piotruś otrzymał kartkę, na której napisane były małe liczby. Piotruś ma za zadanie stwierdzić, czy dana liczba jest palindromem (tzn. czy czyta się ją tak samo od lewej do prawej strony, jak od prawej do lewej). Jeżeli nie, Piotruś powinien dodać do siebie wartość liczby czytanej od lewej do prawej oraz wartość liczby czytanej od prawej do lewej, sprawdzić, czy suma jest palindromem, i jeżeli nie -- kontynuować proces, aż otrzyma palindrom. Przykładowo, mając daną liczbę 28, Piotruś stwierdzi, że nie jest ona palindromem i wykona dodawanie 28 + 82 = 110. Liczba 110 wciąż nie jest palindromem, zatem Piotruś wykona jeszcze dodawanie 110 + 011 = 110 + 11 = 121. Wynik tego dodawania jest już palindromem, więc obliczenia zostaną zakończone. Twoim zadaniem jest napisać program, który dla każdej liczby rozważanej przez Piotrusia wypisze palindrom (wynik obliczeń Piotrusia), oraz liczbę dodawań prowadzących do wyniku. 
Wejście Pierwsza linia pliku wejściowego zawiera liczbę t (t <= 80), określającą, ile liczb znajduje się na kartce Piotrusia. Każda z następnych t linii zawiera dokładnie jedną liczbę naturalną n (1 <= n <= 80), dla której Piotruś musi wykonać obliczenia. 
Wyjście Dla kolejnych liczb podanych na kartce wypisz po jednej linijce zawierającej dwie liczby całkowite oddzielone spacją. Pierwsza oznacza palindrom otrzymany przez Piotrusia, druga -- liczbę dodawań wykonanych, by go otrzymać. 
Przykład Input: 3 28 68 5 Output: 121 2 1111 3 
5 0 

Zadanie 2: Flamaster Kasia niedawno poznała wszystkie literki w szkole. Z wielką pasją potrafiła całe dnie spędzać na pisaniu długich słów swoim ulubionym flamastrem. Pisała i pisała "tasiemce" tak długo, aż flamaster wypisał się. Kasia posmutniała. Z trudem, ale udało jej się uprosić swoją mamę, aby kupiła jej nowy pisak. Musiała jednak obiecać, że tym razem będzie bardziej oszczędna przy jego używaniu, żeby wystarczył na dłużej. Kasia zaczęła zastanawiać się w jaki sposób będzie mogła zrealizować obietnicę daną mamie.   
Postanowiła, że aby zaoszczędzić wkład flamastra będzie wypisywała skróconą wersję wymyślanych wyrazów. Jeśli miała zamiar napisać więcej niż dwie takie same literki obok siebie w wyrazie, to teraz napisze literkę a następnie liczbę, określającą ilość wystąpień tej literki. Twoim zadaniem jest dla zadanego wyrazu, który wymyśliła Kasia, podanie skróconej wersji tego wyrazu. 
Wejście 
W pierwszej linijce pliku wejściowego znajduje się liczba naturalna C, 1 ≤ C ≤ 50, oznaczająca ilość zestawów danych. W kolejnych C wierszach wejścia znajdują się zestawy danych. Każdy zestaw składa się z niepustego wyrazu złożonego z samych dużych liter alfabetu amerykańskiego. Długość wyrazu nie przekracza 200 znaków. Wyjście 
Dla każdego zestawu danych, dla zadanego wyrazu, na wyjściu powinna znaleźć się jego skrócona wersja. Przykład 
Dla pliku wejściowego: 4 OPSS ABCDEF ABBCCCDDDDEEEEEFGGHIIJKKKL AAAAAAAAAABBBBBBBBBBBBBBBB 
prawidłowym rozwiązaniem jest:  
OPSS ABCDEF ABBC3D4E5FGGHIIJK3L A10B16   


Zadanie 3: Obżartuchy Co roku w Megabajtolandii odbywa się Zlot Obżartuchów. Podczas każdego zlotu tradycją jest, że pierwszego dnia wszyscy uczestnicy obżerają się ciastkami przez całą dobę non-stop, nie mając ani ułamka sekundy przerwy. Jak tylko obżartuch skończy jeść jedno ciastko to od razu musi zabrać się za następne (nie dotyczy to sytuacji pod koniec doby, kiedy to uczestnikowi nie wolno napocząć ciastka, jeśli wie, że nie zdąży go zjeść przed końcem doby). Kolejnym ważnym elementem tradycji jest to, że każdy obżartuch je każde swoje ciastko w niezmiennym przez całą dobę, charakterystycznym dla siebie tempie. Na najbliższy Zlot zostały zaproszone tylko te obżartuchy, które już uczestniczyły w poprzednich Zlotach. Dzięki temu wiadomo z góry w jakim tempie każdy z nich je ciastka (obżartuchy nie lubią zmieniać swojego wyuczonego tempa). Na podstawie tych danych, organizatorzy Zlotu chcą określić, ile należy kupić ciastek. Sytuację utrudnia fakt, że ciastka w sklepie sprzedawane są w pudełkach o stałej wielkości, a nie na sztuki - przez to być może trzeba będzie kupić trochę więcej ciastek niż zostanie zjedzonych. 
Mając daną liczbę obżartuchów zaproszonych na Zlot oraz czas jedzenia pojedynczego ciastka (podany w sekundach) przez każdego z nich Twój program powinien policzyć, ile należy kupić pudełek z ciastkami. 
Wejście W pierwszej linii pliku wejściowego znajduje się jedna dodatnia liczba całkowita, oznaczająca liczbę zestawów testowych, które dalej pojawią się na wejściu. Każdy zestaw ma następującą postać. W pierwszej linii znajdują się dwie liczby całkowite N i M oddzielone pojedynczą spacją (1 ≤ N ≤ 10.000, 1 ≤ M ≤ 1.000.000.000). Oznaczają one odpowiednio liczbę zaproszonych obżartuchów na Zlot oraz liczbę ciastek w jednym pudełku. Kolejne N wierszy zestawu zawiera po jednej liczbie całkowitej dodatniej niewiększej niż 100.000. Są to czasy (w sekundach) jedzenia pojedynczego ciastka przez kolejnych obżartuchów. 
Wyjście Dla każdego zestawu danych pojawiającego się na wejściu należy wypisać dokładnie jedną liczbę całkowitą (każdą w osobnej linii), oznaczającą liczbę pudełek z ciastkami, jaką organizatorzy muszą kupić na Zlot. 
Przykład Dla pliku wejściowego: 2 2 10 3600 1800 3 356 123 32999 10101 
poprawnym rozwiązaniem jest: 
8 2 

Zadanie 4: Nowa działka Tata Jasia kupił nową działkę. Był ze swojego zakupu bardzo dumny! Pierwsze co zrobił po podpisaniu umowy to zabrał całą rodzinę, aby obejrzeć nową działkę. Wśród nich był Jaś.  
Jasiowi działka też bardzo się podobała. Tata poinstruował go, że zgodnie z obserwacjami Jasia, działka ma kształt idealnego kwadratu. Jaś natychmiast przypomniał sobie ze szkoły ostatnią lekcję matematyki, na której to uczył się, jak obliczać powierzchnie kwadratów. Wystarczyło więc, żeby znał długość jednego boku działki, a już wiedziałby, jaką powierzchnię ma całość. Potrzebował tylko tego jednego wymiaru.  
Tata zajął się z mamą rozpatrywaniem wizji na temat wykorzystania tak wspaniałego kawałka ziemi. Jaś nie mając w nich pomocy, nie zwracając na nich uwagi, poszedł do narożnika działki. Tam stanął i zacząć stawiać wzdłuż płotu równe kroki. Gdy doszedł do drugiego narożnika znał już długość jednego boku, dzięki czemu mógł już obliczyć powierzchnię całej działki! Niestety, samo rachowanie nie jest jeszcze jego mocną stroną, więc potrzebuje pomocy.  
Znając liczbę kroków wyliczonych przez Jasia, oblicz powierzchnię działki w „krokach kwadratowych Jasia”. 
Wejście Pierwsza linia pliku wejściowego zawiera liczbę całkowitą D (1 ≤ D ≤ 500) oznaczającą liczbę zestawów danych. Każdy zestaw składa się z jednej dodatniej liczby całkowitej X (1 ≤ X ≤ 1000) określającej liczbę kroków wyliczonych przez Jasia. Wyjście 
Dla każdego zestawu danych należy wypisać w osobnej linii jedną liczbę oznaczającą powierzchnię działki w „krokach kwadratowych Jasia”. 
Przykład Dla pliku wejściowego: 2 5 3 
poprawnym rozwiązaniem jest: 25 9 


Zadanie 5: Zliczcz liter Koło Młodych Miłośników Łamania Szyfrów pracuje nad odszyfrowaniem pewnego starożytnego manuskryptu. Jądrem systemu ma być samouczący się analizator tekstu, a jego pierwszym modułem ma być "zliczacz liter", którego opracowanie powierzono Tobie. Opracuj program ZLI, który: • wczyta z pliku tekst do analizy, • dla każdej litery obliczy liczbę jej wystąpień w tekście wypisze wynik na standardowe wyjście. Wejście 
W pierwszym wierszu N - liczba wierszy tekstu do analizy (N ≤ 150). W każdym z następujących N wierszy ciąg złożony z maksymalnie 200 znaków spośród małych i wielkich liter alfabetu łacińskiego ('a'..'z', 'A'..'Z') oraz spacji. 
Wyjście 
W kolejnych wierszach litery od 'a' do 'z' i od 'A' do 'Z' w tej kolejności, a po każdej literze spacja i liczba wskazująca, ile razy ta litera wystąpiła w tekście. Uwaga: Pomiń litery, które nie występują w tekście. 
Przykład Dla pliku wejściowego: 2 ala ma kota Ola ma psa 
poprawnym rozwiązaniem jest: a 7 k 1 l 2 m 2 o 1 p 1 s 1 t 1 O 1 


Zadanie 6: Samolot Bajtockie Linie Lotnicze wzbogaciły swoją flotę o nowy model samolotu. W samolocie tym jest n1 rzędów miejsc siedzących w klasie biznesowej oraz n2 rzędów w klasie ekonomicznej. W klasie biznesowej każdy rząd ma k1 miejsc siedzących, a w klasie ekonomicznej — k2 miejsc. Napisz program, który: • wczyta informacje na temat dostępnych miejsc siedzących w samolocie, • wyznaczy sumaryczną liczbę wszystkich miejsc siedzących, • wypisze wynik 
Wejście Na wejściu znajdują się cztery liczby naturalne n1, k1, n2, i k2 (1 <= n1, k1, n2, k2 <= 1000), pooddzielane pojedynczymi spacjami. 
Wyjście 
Liczba miejsc siedzących w analizowanym samolocie. 
Przykład Input: 2 5 3 20 Output 70  


Zadanie 7: Kabalistyczny zapis daty Istnieje bardzo łatwy sposób zapisu daty. Ten typowo barokowy pomysł nawiązywał do kabały, w której literom hebrajskim przypisane były liczby. W tym wypadku litery alfabetu łacińskiego odpowiadały następującym liczbom: A       B       C       D       E       F       G       H       I       K 1       2        3        4       5       6        7        8       9     10 L       M       N       O       P       Q       R       S       T       V  20     30      40      50     60      70      80     90     100   200 X       Y       Z 300   400   500 
Datę oblicza się sumując wszystkie liczby odpowiadające kolejnym literom tekstu. Zapis stosowano w drukach i rękopisach. W przypadku druków najczęściej podawano pod poszczególnymi słowami sumę liczb ich liter. Autorzy trudzili się nad stworzeniem tekstu, z którego daje się odczytać datę. 
Wejście 
Na wejściu podany jest wyraz, pisany małymi literami (używając wyłącznie liter podanych powyżej), nie dłuższy niż 25 znaków. 
Wyjście 
Na wyjściu podany jest rok w postaci liczby naturalnej, który zapisałeś za pomocą wyrazu (czyli sumy każdej z liczb). 
Przykład Input info Output 105  
Input miska Output 140 


Zadanie 8: Równanie liniowe Równanie liniowe ma postać 𝑎𝑥+𝑏=𝑐, gdzie 𝑎,𝑏,𝑐,𝑥∈ ℝ. Zauważ, że równanie może mieć jedno rozwiązanie, brak rozwiązań lub nieskończenie wiele rozwiązań.  
Wejście 
Na wejściu podane są trzy liczby rzeczywiste (kolejno a, b, c) zaokrąglone do drugiego miejsca po przecinku. 
Wyjście 
Rozwiązaniem zadania powinna być liczba rzeczywista zaokrąglona do drugiego miejsca po przecinku (gdy równanie ma jedno rozwiązanie) lub komunikat informujący, że równanie nie ma rozwiązań, bądź ma ich nieskończenie wiele (rozróżniamy te komunikaty – nie może być jednego ogólnego). 
Przykład Input 
0.52 1.60 -5.44 Output 
-13.54  
Input 
0.00 2.00 3.00 Output 
Równanie nie ma rozwiązań  
Input 0.00 2.00 2.00 Output 
Równanie ma nieskończenie wiele rozwiązań 


Zadanie 9: Liczba na słowo Jaś zaczął pracować w dziale firmy odpowiedzialnym za finanse. Do jego codziennych obowiązków należy wypełnianie przelewów pocztowych za różnego rodzaju płatności. Po kilku dniach zaczął odczuwać zniechęcenie, gdy po raz setny musiał na przelewie wypisywać słownie kwotę. Pomóż Jasiowi i napisz program, który będzie zamieniał liczbę na jej zapis słowny. 
Wejście Na wejściu podana jest liczba 0≤𝑥≤1012 𝑥∈ℕ.  
Wyjście Rozwiązaniem zadania powinien być słowny zapis liczby 𝑥 wraz z nominałem zł. Podczas rozwiązania zadania należy pamiętać o poprawnej formie gramatycznej zarówno zapisu liczbowego jak i słowa złoty.   
Przykład Input 1234 Output 
Tysiąc dwieście trzydzieści cztery złote.  
Input 3432423432 Output 
Trzy miliardy czterysta trzydzieści dwa miliony czterysta dwadzieścia trzy tysiące czterysta trzydzieści dwa złote  
Input 12256 Output 
Dwanaście tysięcy dwieście pięćdziesiąt sześć złotych   


Zadanie 10: Porównanie dużych liczb Napisz program, który dla podanego wejścia sprawdzi podaną relacje. 
Wejście Na wejściu podany zostanie zestaw danych, który składa się liczb 𝑥,𝑦∈ℝ. Po liczbie x następuje symbol relacji (==, !=, >=, <=, >, <) a po nim liczba y.  
Wyjście 
Na wyjściu program powinien wyświetlić odpowiedni komunikat informujący czy podany przykład jest prawdziwy. 
Przykład Input 
100 == 200 Output 
FAŁSZ  
Input 
200 >= 200 Output 
PRAWDA  
Input 
200 < 200 Output 
FAŁSZ   


Zadanie 11: Pieczątki dzieci Jaś i Staś uwielbiają bawić się swoimi zabawkami. Ich mama w ramach prezentu za dobre sprawowanie kupiła im ogromny zestaw pieczątek. Niestety okazało się, że mamę chłopców oszukano. Wśród ogromnego wora pieczątek z cyferkami aż 𝐾 z nich miało na sobie piątki. Chłopcy bardzo poirytowani taką sytuacją postanowili się dostosować. Jaś wybiera sobie liczbę 𝑁, a zadaniem Stasia jest podać najmniejszą liczbę, która jest większa od 𝑁 i zawiera co najmniej 𝐾 piątek. Napisz program, który po wczytaniu liczby 𝑁 i 𝐾 wypisze liczbę 𝑋 będącą liczbą większą od 𝑁 i zawierającą co najmniej 𝐾 piątek. Wejście Na wejściu podane będą liczby 𝑁 i 𝐾,  1≤𝑁≤1015,1≤𝐾≤15. 
Wyjście Wyjściem jest wcześniej wspomniana liczba 𝑋, czyli najmniejsza liczba większa od 𝑁, która zawiera co najmniej 𝐾 piątek.  
Przykład Input 
595 2 Output 
655


Zadanie 12: Pieczątki dzieci 2 Spróbuj rozszerzyć poprzednie zadanie i jako trzeci argument pobieraj cyfrę, która ma więcej pieczątek.  
Wejście Na wejściu podane będą liczby 𝑁, 𝐾,𝑍 1≤𝑁≤1015,1≤𝐾≤15, 0 ≤𝑍≤9. 
Wyjście Wyjściem jest wcześniej wspomniana liczba 𝑋, czyli najmniejsza liczba większa od 𝑁, która zawiera co najmniej 𝐾 liczb 𝑍.  
Przykład Input 
595 2 7 Output 
677 


Zadanie 13: Skracanie identyfikatorów 
W latach 50. ubiegłego wieku, kiedy programowanie było jeszcze w powijakach, kompilatory nie były nawet w części tak zaawansowane, jak są dzisiaj. Na programistę nakładano całą masę ograniczeń różnej natury, które dzisiaj wydawać się mogą śmieszne i niezrozumiałe. I tak na przykład wczesne kompilatory języka Fortran potrafiły narzucać maksymalną długość nazw zmiennych, co oznaczało, że programiście nie było wolno nazywać swoich danych tak, jakby sobie tego życzył i zmuszało go do karkołomnego skracania swoich przydługich nazw, aby woli kompilatora stało się zadość. 
W konsekwencji społeczności programistów, skupionych np. w różnych laboratoriach badawczych, wypracowywały dla siebie jednolite konwencje i standardy mówiące, w jaki sposób należy skracać nazwy zmiennych, aby nie były dłuższe niż n (gdzie n mogło silnie zależeć od używanego kompilatora). Jedną z takich konwencji możemy opisać w sposób następujący: • napisz nazwę zmiennej w postaci, w której życzyłbyś sobie ją widzieć – używaj tylko liter, cyfr oraz znaków '_' (podkreślenie) i '$' (dolar); może zabrzmi to dziwnie, ale znak '$' traktować będziemy jak literę (czyni to do dzisiaj wiele kompilatorów); • jeśli długość nazwy jest mniejsza równa n, możesz jej użyć i nie musisz robić nic więcej • w przeciwnym wypadku usuwaj z nazwy, począwszy od końca, wszystkie znaki, które nie są literami i cyframi – w chwili, w której długość nazwy osiągnie n, możesz zakończyć pracę i użyć nazwy zmiennej • jeśli długość nazwy nadal jest większa od n, usuwaj z niej, począwszy od końca, kolejne cyfry - w chwili, w której długość nazwy osiągnie n możesz zakończyć pracę i użyć nazwy zmiennej • jeśli długość nazwy nadal jest większa od n, usuwaj z niej, począwszy od początku, kolejne samogłoski z wyjątkiem pierwszej (chodzi o to, by w nazwie została chociaż jedna samogłoska, o ile jakakolwiek została użyta) - w chwili, w której długość nazwy osiągnie n, możesz zakończyć pracę i użyć nazwy zmiennej • jeśli długość nazwy nadal jest większa od n, usuwaj z niej znaki od końca, począwszy od przedostatniego - w chwili, w której długość nazwy osiągnie n, możesz zakończyć pracę i użyć nazwy zmiennej 
Wejście Na wejściu podane będą: liczba 𝑛 – maksymalna długość zmiennej, a także sama zmienna do skracania 
Wyjście 
Skrócona zmienna 
Przykład Input 
7 ALA_MA_KOTA_I_2_PSY Output 
ALMKTPS   


Zadanie 14: Punkty w kole 
Dla koła o danym promieniu r oraz środku o współrzędnych (0,0) znajdź liczbę punktów o współrzędnych całkowitych znajdujących się wewnątrz lub na brzegu koła. 
Wejście 
Na wejściu podany będzie promień r.  
Wyjście 
Ilość punktów siatki układu współrzędnych w kole o promieniu r.  
Przykład Input 1 Output 5    
  
  
Zadanie 15: Śnieg 
Wesoła rodzinka Państwa Bajtockich wybrała się w góry. Właśnie wędrują sobie gęsiego po śniegu. Pierwszy idzie mały Bitek, następnie jego mama Bajbitka a na końcu ojciec Bajtjusz. Napisz program, który określi, ile razy na odcinku 𝑠 metrów ślady wszystkich trzech osób pokryją się. 
Zakładamy, że wszyscy ruszają z tego samego miejsca, pierwszy ślad jest tuż przed linią startu oraz wielkość śladu jest pomijalnie mała. 
Wejście Podane zostaną cztery liczby całkowite 𝑎,𝑏,𝑐,𝑠, gdzie 𝑎,𝑏,𝑐 to długości kroków, jakie stawiają osoby z rodzinki (w centymetrach), następnie liczba całkowita 𝑠, określająca długość trasy (w metrach). 
Wyjście 
Jedna liczba określająca ile razy pokryją się ślady wszystkich osób w rodzinie.  
Przykład Input 30 40 50 2 Output 0  
Input 30 30 60 3 Output 5 
