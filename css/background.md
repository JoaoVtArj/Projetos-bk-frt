Nas próximas aulas nós vamos ver mais sobre a propriedade background.

Background
Define um fundo para nosso elemento
Sua área de atuação é a caixa toda
Por padrão, é transparente
Exemplos
Usar cores solidas
Usar imagens
Controlar
a posição das imagens
se elas se repetem ou não
o tamanho delas na caixa
Usar cor e imagem juntas
Usar cor gradiente

A propriedade background-origin é quem define o ponto de origem de uma imagem específica.
/* Principais valores */
background-origin: border-box;
background-origin: padding-box;
background-origin: content-box;
O background-clip define se a cor ou imagem do background iniciam debaixo de sua área de borda, preenchimento ou conteúdo.
/* Principais valores */
background-clip: border-box;
background-clip: padding-box;
background-clip: content-box;
background-clip: text;

----------
A propriedade background-attachment determina se a posição da imagem vai ser fixa ou se vai rolar junto com o conteúdo.

/* Principais valores */
background-attachment: scroll;
background-attachment: fixed;
background-attachment: local;
-----
Podemos usar o shorthand background para definir todos os valores do background

linear-gradient() é a função usada para criar gradient linear com o CSS.
background: linear-gradient(45deg, red, yellow)
radial-gradient() é a função usada para criar gradient circular.
background: radial-gradient(green, red, yellow)
background: radial-gradient(rgba(255, 255, 255, 0), rgba(255, 0, 0, 0.2))

Podemos aplicar múltiplos backgrounds em um mesmo elemento, podendo ter cor sólida, gradiente ou imagem. Para isso basta separar por vírgula cada background.