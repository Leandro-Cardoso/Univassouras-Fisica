import os # Necessário para limpar o terminal

# DEFINIÇÃO DA CLASSE PARA O CORPO:
class Body:
    def __init__(self, t0:float, x0:float, v0:float, a:float) -> None:
        '''
        Definição dos parâmetros:
            Instante inicial (t0)
            Posição e velocidade iniciais (x0 e v0)
            Aceleração (a)
        '''
        self.t0 = t0
        self.x0 = x0
        self.v0 = v0
        self.a = a

    def getVelocity(self, t:float) -> float:
        ''' Calcula e retorna a velocidade do corpo no tempo (t) '''
        t -= self.t0 # Considerar apenas o tempo do movimento
        return self.v0 + self.a * t # Formula para a velocidade
    
    def getPosition(self, t:float) -> float:
        ''' Calcula e retorna a posição do corpo no tempo (t) '''
        t -= self.t0 # Considerar apenas o tempo do movimento
        return self.x0 + self.v0 * t + (self.a * t ** 2) / 2 # Formula para a posição

# LIMPAR TELA DO TERMINAL:
def clearTerminal() -> None:
    ''' Limpa a tela do terminal em qualquer sistema operacional '''
    if os.name == 'nt':
        os.system('cls') # No caso de ser Windows
    else:
        os.system('clear') # No caso de outro sistema

# MENU:
def menu() -> int:
    ''' Exibe o menu no terminal e retorna o número da opção escolhida '''
    while True:
        print('\nDigite apenas o numero da opcao desejada...\n')
        # Opções do menu:
        print('1 - Sair')
        print('2 - Calcular a posicao de um corpo (MRUV)')
        choice = input('\nOPCAO: ') # Capturar opção desejada
        clearTerminal() # Limpar tela do terminal
        # Retorno das opções caso seja válida:
        if choice == '1':
            return 1
        elif choice == '2':
            return 2
        else:
            # Erro em caso de opção inválida:
            print('\nERRO: Opcao invalida!') 

# PEGAR DADOS:
def getInputs() -> list[float]:
    ''' Captura os inputs e retorna em uma lista '''
    while True:
        print('\nDigite apenas numeros reais...\n')
        # Tentar capturar e converter dado para float:
        try:
            t0 = float(input('Instante inicial (t0): '))
            x0 = float(input('Posicao inicial (x0): '))
            v0 = float(input('Velocidade inicial (v0): '))
            a = float(input('Aceleracao (a): '))
            t = float(input('Instante final (t): '))
            clearTerminal() # Limpar tela do terminal
            break
        # Se não conseguir mostrar erro no terminal:
        except Exception as e:
            clearTerminal() # Limpar tela do terminal
            print(f'\nERRO: {e}')
    return t0, x0, v0, a, t # Retornar os parametros

# FUNÇÃO PRINCIPAL:
def main() -> None:
    clearTerminal()
    while True:
        choice = menu() # Exibir menu e capturar opção desejada
        if choice == 1: # Caso a opção seja 1 encerrar app
            break
        t0, x0, v0, a, t = getInputs() # Capturar os inputs necessários (os parametros)
        corpo = Body(t0, x0, v0, a) # Instanciar classe "Body"2
        # Mostrar cada instante do inicial até o instante final:
        for tn in range(int(t0), int(t) + 1):
            x = corpo.getPosition(tn) # Calcular a posição no tempo
            print(f'Posicao t = {tn} | x = {x}')

# CHAMADA DE FUNÇÃO PRINCIPAL:
if __name__ == '__main__':
    main()
