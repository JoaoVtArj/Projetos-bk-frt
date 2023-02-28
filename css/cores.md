## valores
podemos definir os valores po 
* palavra-chave (blue, trasparent)
* hexadecimal(#089)
* funçoes: rgb, rgba, hsl, hsla

css
keyword values
color: currentcolor;

<named-color> values
color: red;
coloer orange;
color: tan
Nessa aula vamos aprender a trabalhar com valores hexadecimal

/*<hex-color> values 0-9 e A-F*/
color: #090; /* RED, GREEN, BLUE */
color: #009900;
color: #090a;
color:#009900aa;

RGB → Red, Green e Blue
O alpha representa a transparência da cor
/*<rgb()> values */
color: rgb(34, 12, 64, 0.6) /* 0-255 */
color: rgba(34, 12, 64, 0.6)

HSL → Hue - Saturation - Lightness

color: hsl(180, 100%, 50%, 60%)
color: hsla(180, 100%, 50%, 60%)

Nessa aula vamos ver sobre os valores globais da propriedade color.

/* Global values */
color: inheritr; /* Herda a cor do elemento anterior */
color: initial; /* Volta a sua cor inicial */
color: unset; /* Pega a cor do contexto */

Entendendo esses princípios e com a prática, fica cada vez mais fácil entender como aplicar cores no CSS.

Referência
https://developer.mozilla.org/en-US/docs/Web/CSS/color_value