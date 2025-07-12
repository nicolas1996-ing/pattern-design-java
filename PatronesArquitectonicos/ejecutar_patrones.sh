#!/bin/bash

echo "=== EJECUTANDO PATRONES ARQUITECTÓNICOS ==="
echo ""

echo "1. Patrón MVC:"
java -cp bin mvc.Main
echo ""

echo "2. Patrón Business Delegate:"
java -cp bin businessdelegate.Main
echo ""

echo "3. Patrón Data Access Object:"
java -cp bin dataaccessobject.Main
echo ""

echo "4. Patrón Intercepting Filter:"
java -cp bin interceptingfilter.Main
echo ""

echo "5. Patrón Front Controller:"
java -cp bin frontcontroller.Main
echo ""

echo "6. Patrón Composite Entity:"
java -cp bin compositeentity.Main
echo ""

echo "7. Patrón Service Locator:"
java -cp bin servicelocator.Main
echo ""

echo "8. Patrón Microservices:"
java -cp bin microservices.Main
echo ""

echo "=== TODOS LOS PATRONES EJECUTADOS ==="
