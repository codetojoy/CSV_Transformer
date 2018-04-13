#!/bin/bash 

gradle clean installDist
./staging/bin/CSV_Transformer ./original/data.csv > out.csv

echo "Ready."
