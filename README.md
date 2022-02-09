# Introductie

Deze oefening is deel van de DEA Course aan de Hogeschool Arnhem/Nijmegen. 
Onderwerp is het bekend raken met de Stream API.

# Oefening

Deze oefeningen bestaan uit het laten slagen van Unittests.

FYI: Namen van test methodes dienen altijd descriptief te zijn! Om de tests in de goede volgorde te zien in IntelliJ - zodat je ze één voor één kunt gaan laten slagen - zit in de testmethode namen een volgnummer. Zo staan ze alfabetisch ook in de hier gebruikte volgorde, want IntelliJ ordent de tests standaard alfabetisch op methodenaam (een vaker gebruikt 'developers trucje'). Maar in de unit tests die jezelf in dit vak schrijft gebruik je GEEN nummers (want volgorde van unit tests moet niet uitmaken).
> "Ideally, the order in which unit tests run should not matter, and it is best practice to avoid ordering unit tests." - [Microsoft docs](https://docs.microsoft.com/en-us/dotnet/core/testing/order-unit-tests)

## Stream tests

### I. Het filteren van een lijst
 * test1RemoveStringsWithMoreThanThreeCharacters
 * test2RemoveNonNumeralStrings

### II. Het identificeren van een element uit een lijst
 * test3AFindShortestString
 * test3BFindShortestStringOfEmptyList

### III. Het samenvoegen van de elementen uit een lijst
 * test4CreateAFullSentenceFromTheList
 
### IV. Het bepalen van totalen
 * test5CalculateTotalCostOfAllProducts
 * test6CalculateTotalCostOfAllGadgets
