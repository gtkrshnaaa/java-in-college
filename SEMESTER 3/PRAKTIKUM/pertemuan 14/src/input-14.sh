#!/bin/bash

sleep 3

NIM=('125410067' '155410125' '115410125' '115410066' '165410136' '145410112' '155410133' '155410143')
NAMES=('AgungBP' 'Rulieta' 'Kayra' 'Elnathan' 'Niken' 'Liwin' 'Satrio' 'Dion')
ADDRESS=('Jakarta' 'KualaKapuas' 'Yogyakarta' 'Yogyakarta' 'Magelang' 'Palangkaraya' 'Semarang' 'Bantul')
VOCALS=('a' 'i' 'u' 'e' 'o' 'a' 'i' 'u')
GENDER=('L' 'P')

write_student ()
{
    xdotool type $3
    xdotool key 'Return'
    xdotool type $1
    xdotool key 'Return'
    xdotool type $2
    xdotool key 'Return'
    xdotool type $5
    xdotool key 'Return'
    xdotool type $4
    xdotool key 'Return'
    xdotool type $5
    xdotool key 'Return'
}

COUNTER=0

xdotool type '8'
xdotool key 'Return'

for name in "${NAMES[@]}"; do
    RAND=$[$RANDOM % ${#GENDER[@]}]
    write_student $name ${ADDRESS[COUNTER]} ${NIM[COUNTER]} ${GENDER[$RAND]} $COUNTER
    let COUNTER++
done

exit 0


