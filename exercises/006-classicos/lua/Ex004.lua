x = io.read("*n")
anterior = 0
atual = 1
for i = 1, x, 1
do
    io.write(atual, ' | ')
    atual = atual + anterior
    anterior = atual - anterior
end
io.write('\n')
