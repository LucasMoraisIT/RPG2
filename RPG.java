package RPG2;
import java.util.ArrayList;
import java.util.Scanner;
public class RPG {
  public static void main(String[]args){
    System.out.println("Muito bem vindo(a) ao fabrica de lendas!! Por favor insira o seu nome");
    Scanner entrada = new Scanner(System.in);
    ArrayList<Escolha> opcoesCriadas = new ArrayList<Escolha>();
    Player P1 = new Player();
    P1.nome= entrada.nextLine();
    int opcao=P1.setEscolha(4,P1.nome+" Escolha como vai jogar: ","1 - Minopira","2 - Avatar","3 - Criador","4 - JogadorLogado");
    while(P1.vida>0){
      if(opcao==1){
                Raca Minopira = new Raca(40,70,1);
                Minopira.getAtributos();
                System.out.println("História:\n\n Há muitos séculos, em uma terra mágica e misteriosa conhecida como Bosque Labiríntico, surgiu uma raça única e enigmática chamada Minopira. Os Minopiras eram seres que combinavam a robustez e a força física dos minotauros com a ligação profunda com a natureza e a habilidade de controlar o ambiente dos curupiras. Sua aparência era uma fusão impressionante: eles tinham corpos humanóides com chifres curvados na cabeça, cabelos verdes como musgo, olhos dourados e pernas fortes, cobertas por cascas de árvores.\n\n Os Minopiras eram conhecidos por serem os guardiões do Bosque Labiríntico, um lugar repleto de magia e vida selvagem. Eles tinham a capacidade de se camuflar no ambiente, tornando-se quase invisíveis na densa vegetação do bosque, assim como os curupiras. Além disso, podiam se comunicar com animais e plantas, entendendo e influenciando os eventos da floresta.\n\n A sociedade Minopira era organizada em clãs, cada um liderado por um ancião sábio que detinha o conhecimento transmitido ao longo das gerações. Os Minopiras viviam em harmonia com a natureza, protegendo o bosque dos invasores e caçadores que ameaçavam sua casa. Eles acreditavam que sua missão era manter o equilíbrio na floresta, garantindo que cada criatura e planta tivesse seu espaço e prosperasse.\n\n Os Minopiras eram conhecidos por suas festas e rituais sazonais, que celebravam o ciclo da natureza e a renovação do bosque. Durante esses eventos, eles dançavam ao redor de fogueiras, entoavam canções mágicas e se uniam à essência da floresta.\n\n A história dos Minopiras começa a se desenrolar quando um grupo de aventureiros humanos decide explorar o Bosque Labiríntico em busca de tesouros e segredos.\n\n ");
                opcao=P1.setEscolha(3,"O Encontro com Estranhos: Você, um Minopira, está patrulhando o Bosque Labiríntico quando ouve vozes estranhas se aproximando. Você decide","1 - Esconder-se nas sombras e observar","2 - Abordar os aventureiros amigavelmente","3 - Atacar os aventureiros","");
                if(opcao==1){
                  opcao=P1.setEscolha(3, "Você se camufla e observa um grupo de aventureiros humanos que entram na floresta em busca de tesouros.", "1 Observar Os aventureiros continuam a explorar o bosque, mas não causam dano.", "2 - Conversar com os aventureiros", "3- Atacar os aventureiros","");
                  if(opcao==1){
                    opcao=P1.setEscolha(3, "Depois de escolher observar os aventureiros em vez de confrontá-los, você decide:", "1 - Seguir os aventureiros secretamente: escondido no Bosque Labiríntico.", "2 - Relatar suas descobertas ao conselho dos Minopiras ", "3 - Ao escolher intervir para proteger a floresta", "");
                    if(opcao==1){
                      opcao=P1.setEscolha(3, " Você opta por seguir o grupo de aventureiros à distância, mantendo-se camuflado e monitorando suas ações. Durante a sua vigilância silenciosa, você nota que os aventureiros encontraram um antigo santuário Eles começam a mexer nas relíquias sagradas e perturbam a harmonia da floresta. O que você decide fazer?", "Intervir e pedir que eles parem.", "Relatar a situação ao conselho dos Minopira ", "Enfrentar os aventureiros diretamente", "");
                      if(opcao==1){
                        opcao=P1.setEscolha(3,"Você se aproxima dos aventureiros e tenta explicar a importância do santuário e como eles estão perturbando o equilíbrio da floresta. No entanto eles não te escutam o que você decide fazer?", "1 - Você opta por seguir o grupo de aventureiros à distância, mantendo-se camuflado e monitorando suas ações."," 2 - Você decide confrontar diretamente os aventureiros, acreditando que esta é a melhor maneira de proteger o Bosque Labiríntico.", "3 - Você insiste em se aproximar dos aventureiros e tenta explicar novamente a importância do santuário e como eles estão perturbando o equilíbrio da floresta.","");
                        if(opcao==1){
                          System.out.println("À medida que você os segue, percebe que eles estão se aproximando de um local sagrado dentro do Bosque Labiríntico, onde está localizado o Coração da Floresta, uma fonte de energia vital para a floresta e os Minopiras. Os aventureiros parecem estar se aproximando dessa localização. eles roubam a energia vital e as raças dos minopiras se extinguem"); 
                        P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Um confronto se inicia, com os aventureiros desembainhando suas armas e lançando feitiços. Você usa sua força e habilidades mágicas para enfrentá-los e proteger o santuário. Com determinação e estratégia, você consegue derrotar os aventureiros e expulsá-los do bosque.");
                        }
                        else if(opcao==3){
                          System.out.println("Um deles, o líder do grupo, empunha sua espada e ataca você. Uma batalha feroz se inicia, mas, infelizmente, você é superado pela força dos aventureiros. Seus esforços para proteger o Bosque Labiríntico são em vão, e você perde a vida no confronto. PATÉTICO!!!");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        opcao=P1.setEscolha(3,"Você decide informar o conselho sobre a situação e pedir orientação sobre como lidar com os aventureiros. O conselho dos Minopiras decidem entre","1: Intervir diretamente. Decidindo que a situação requer ação imediata, você deixa suas sombras e se aproxima silenciosamente dos aventureiros.","2: Os anciãos, cientes da ameaça, revelam um antigo ritual que pode selar o santuário e restaurar a harmonia da floresta.","3: Tornar-se um inimigo secreto","");
                        if(opcao==1){
                          System.out.println("Explica-lhes a importância do santuário e pede que deixem o bosque imediatamente. No entanto, os aventureiros não estão dispostos a ceder e decidem atacar. Infelizmente, a batalha é árdua, e apesar de sua coragem, você é superado pelo número e habilidades dos aventureiros. Sua valentia custa caro, e você sucumbe em defesa do Bosque Labiríntico.");
                        }
                        else if(opcao==2){
                          System.out.println("Guiado pela magia ancestral, você parte para realizar o ritual, enfrentando desafios mágicos e enfrentando os aventureiros com uma combinação de astúcia e poder mágico. No final, você triunfa, selando o santuário e devolvendo a paz ao Bosque Labiríntico. Os Minopiras celebram sua coragem e sabedoria, reconhecendo-o como um herói da floresta.");
                        }
                        else if(opcao==3){
                          System.out.println("Conforme os dias passam, você se torna uma presença invisível, influenciando discretamente o ambiente para dificultar a jornada dos aventureiros. No entanto, uma noite, um dos aventureiros percebe seus movimentos furtivos e decide caçá-lo. Apesar de seus esforços para escapar, você é capturado e derrotado, sacrificando-se para proteger o segredo do Bosque Labiríntico.");
                        }
                      }
                      else if(opcao==3){
                        System.out.println("Sentindo a urgência de proteger o santuário e a harmonia do Bosque Labiríntico, você decide confrontar os aventureiros diretamente. Saindo das sombras, você revela sua presença e exige que parem de perturbar o santuário. No entanto, os aventureiros, surpresos e amedrontados, interpretam sua abordagem como uma ameaça e decidem atacar. A batalha é intensa, mas, infelizmente, a superioridade numérica e as habilidades dos aventureiros provam ser demais. Apesar de lutar com bravura, você é derrotado, sacrificando sua vida para proteger o santuário e a essência do Bosque Labiríntico.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==2){
                      opcao=P1.setEscolha(3,"Você retorna ao seu clã e compartilha as informações que reuniu sobre os aventureiros, buscando orientação do conselho. O conselho vota e escolhe:","1 - Manter a vigilância silenciosa","2 - Preparar uma emboscada para os aventureiros","3 - Confronta-los diretamente","");
                      if(opcao==1){
                        opcao=P1.setEscolha(3, "Você continua a observar os aventureiros, mantendo-se camuflado e monitorando suas ações, enquanto seu clã decide uma abordagem futura.", "1 - Se aproximar corajosamente com intuito de explicar aos aventureiros", "2 - Intimida-los para que entendam no perigo que estão se colocando", "3 - Lutar contra os aventureiros", "");
                        if(opcao==1){
                          System.out.println("Após relatar suas descobertas ao conselho dos Minopiras, eles decidem que é essencial proteger o Bosque Labiríntico a todo custo. Você, corajosamente, se aproxima dos aventureiros, revelando-se a eles e alertando sobre a importância de preservar a floresta e protegem e mantém tudo estável no bosque.");
                        }else if(opcao==2){
                          System.out.println("Infelizmente, os aventureiros não entendem ou não se importam com o valor do Bosque Labiríntico. Uma batalha se inicia, e apesar de sua força e habilidades mágicas, você se vê em desvantagem numérica. Os aventureiros, determinados a conquistar os tesouros do bosque, acabam superando você e seus companheiros Minopiras.");
                          P1.vida=0;
                        }else if(opcao==3){
                          System.out.println("No final, você sucumbe à luta, protegendo a floresta com seu último suspiro, mas não sem antes causar danos consideráveis aos aventureiros. Sua morte serve como um lembrete da importância de proteger o Bosque Labiríntico, e a floresta chora sua perda.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        opcao=P1.setEscolha(3, "Com medo de que os aventureiros possam representar uma ameaça, você decide armar uma emboscada com outros Minopiras, na esperança de afugentá-los.Como sera montada essa emboscada?", "1 - Fortalecer as defesas", "2 - Não enviar um emissário imediatamente, o conselho decide monitorar os aventureiros de perto antes de tomar medidas mais definitivas.", "3 - Investir na diplomacia ", "");
                        if (opcao==1){
                          System.out.println("Decidindo que a prevenção é a melhor estratégia, você retorna ao seu clã e propõe reforçar as defesas do Bosque Labiríntico. Com a liderança dos anciãos, os Minopiras criam barreiras mágicas e armadilhas sutis para proteger o santuário. Os aventureiros, ao encontrar essas defesas, são dissuadidos de perturbar ainda mais a floresta, preservando assim a paz e a harmonia. Sua inteligência estratégica e ação preventiva permitem que você vença o jogo, protegendo com sucesso o Bosque Labiríntico.");
                        }else if(opcao==2){
                          System.out.println("O conselho decide monitorar os aventureiros de perto antes de tomar medidas mais definitivas. Contudo, durante uma emboscada planejada, os aventureiros surpreendem os Minopiras, resultando em uma batalha feroz. Infelizmente, você é derrotado, sacrificando sua vida para preservar a harmonia do Bosque Labiríntico.");
                          P1.vida=0;
                        }else if(opcao==3){
                          System.out.println("Sentindo a necessidade de entender melhor as intenções dos aventureiros, você decide abordar a situação com uma abordagem mais pacífica. Ao encontrar os aventureiros, tenta estabelecer um diálogo amigável, compartilhando o conhecimento dos Minopiras. Infelizmente, um mal-entendido ocorre e a comunicação se transforma em um confronto. Apesar de sua coragem, você é derrotado na batalha, sacrificando sua vida na tentativa de preservar a paz na floresta.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("Ao decidir confronta-los diretamente, a situação fica fora de controle. Durante o confronto, um dos aventureiros revela habilidades mágicas surpreendentes e consegue ferir gravemente você e seus companheiros. Você cai derrotado, percebendo que sua ação impulsiva levou à sua morte e à escalada do conflito. Sua morte serve como um trágico lembrete dos perigos da impulsividade e da importância de buscar soluções pacíficas.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==3){
                      System.out.println("Uma luta se inicia. Durante o combate, um dos aventureiros consegue feri-lo gravemente. Você cai derrotado, com a consciência de que deu sua vida para proteger o Bosque Labiríntico, mas a floresta sofreu perdas irreparáveis. Sua morte serve como um lembrete sombrio dos perigos da intrusão humana.");
                      P1.vida=0;
                    }
                  }
                  else if(opcao==2){
                    opcao=P1.setEscolha(3,"impressionados com sua sabedoria e ligação com a natureza, concordam em aprender com você. Eles prometem proteger o Bosque Labiríntico e se tornam aliados dos Minopiras.Juntos vocês decidem?","1 - Treinar os aventureiros no caminho da floresta","2 - Explorar áreas perigosas da floresta juntos","3 - Ensina-los contra seres da floresta","");
                      if(opcao==1){
                        opcao=P1.setEscolha(3,"Você assume o papel de mentor e começa a treinar os aventureiros nos segredos do Bosque Labiríntico, ensinando-lhes habilidades naturais.","1 - Compartilhar sabedoria com os aventureiros","2 - Treinar os aventureiros nos caminhos da floresta","3 - Desafiar os aventureiros","");
                        if(opcao==1){
                          opcao=P1.setEscolha(3,"Decidindo agir com benevolência, você revela sua presença e se oferece para compartilhar seus conhecimentos sobre o Bosque Labiríntico. Os aventureiros, gratos pela orientação, aceitam sua oferta. Juntos, vocês formam uma aliança, e os aventureiros se comprometem a proteger o bosque, tornando-se aliados dos Minopiras.","1 - Desafiar os Aventureiros","2 - Consolidar a Aliança"," 3 - Treinar os Aventureiros","");
                          if(opcao==1){
                            System.out.println("Desconfiado das intenções dos aventureiros, você decide confrontá-los diretamente. No entanto, ao perceber a verdadeira natureza pacífica dos exploradores, você muda de abordagem e propõe uma aliança. Os aventureiros aceitam, e juntos, vocês enfrentam desafios e superam obstáculos. No final, a aliança floresce, e você vence o jogo, guiando os aventureiros para se tornarem protetores dedicados do Bosque Labiríntico.");
                          }
                          else if(opcao==2){
                            System.out.println("Ao compartilhar sua sabedoria, os aventureiros se mostram receptivos e dispostos a aprender. Juntos, vocês formam uma aliança sólida, prometendo proteger o Bosque Labiríntico. No entanto, durante um ritual de selamento da aliança, uma criatura sombria é atraída pela magia envolvente. Apesar dos esforços conjuntos, a criatura se revela poderosa demais, resultando em uma batalha épica. Infelizmente, você sucumbe na luta, mas sua coragem inspira os aventureiros a derrotar a criatura, preservando a aliança e a paz no bosque.");
                            P1.vida=0;
                          }
                          else if(opcao==3){
                            System.out.println("Assumindo o papel de mentor, você inicia o treinamento dos aventureiros nos segredos do Bosque Labiríntico. No entanto, durante uma simulação de emboscada, um dos aventureiros comete um erro fatal, revelando a localização do grupo. Isso atrai a atenção de uma fera mágica que ataca inesperadamente. Na luta que se segue, você sacrifica sua vida para proteger os aprendizes, permitindo que escapem. Sua morte serve como uma lição sobre os perigos da floresta, mas os aventureiros continuam com sua missão.");
                            P1.vida=0;
                          }
                        }
                        else if(opcao==2){
                          System.out.println("Escolhendo assumir o papel de mentor, você decide treinar os aventureiros nos segredos e habilidades naturais do Bosque Labiríntico. Ao compartilhar sua sabedoria, os aventureiros demonstram uma rápida adaptação aos ensinamentos, aprendendo a se camuflar, comunicar-se com a fauna e flora, e respeitar o equilíbrio da natureza. A harmonia entre os Minopiras e os aventureiros cresce, fortalecendo a proteção do bosque.");
                        }
                        else if(opcao==3){
                          System.out.println("Desconfiado das intenções dos aventureiros, você decide confrontá-los diretamente, temendo que sua presença possa trazer desequilíbrio ao Bosque Labiríntico. Infelizmente, os aventureiros não aceitam a abordagem hostil e respondem com violência. Durante o confronto, você é ferido mortalmente, sacrificando sua vida em um esforço final para proteger a integridade do bosque.");
                        }
                      }
                      else if(opcao==2){
                        opcao=P1.setEscolha(2,"Você propõe uma expedição conjunta ao coração da floresta, onde os perigos são maiores, na esperança de fortalecer os laços entre as raças e proteger o Bosque Labiríntico. Durante a expedição você decide","1 - Ignorar os aventureiros e alertar as criaturas da floresta","2 - Revelar a profecia esquecida","3 - Aceitar a oferta de um artefato mágico","");
                        if(opcao==1){
                          System.out.println(" Desconfiado dos forasteiros, você escolhe ignorar os aventureiros e alertar as criaturas mágicas da floresta sobre a possível ameaça. Infelizmente, as criaturas, interpretando a presença dos aventureiros como uma ameaça imediata, atacam antes que uma comunicação pacífica possa ser estabelecida. O conflito resulta na derrota dos Minopiras e dos aventureiros.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Enquanto observa os aventureiros, você percebe que eles são a chave para uma antiga profecia esquecida. A profecia fala sobre a chegada de forasteiros que desempenharão um papel crucial na preservação do Bosque Labiríntico. Ao revelar essa profecia aos aventureiros, eles percebem que sua presença na floresta é predestinada. Juntos, vocês embarcam em uma jornada para cumprir a profecia, enfrentando desafios e fortalecendo os laços entre Minopiras e humanos. A união resulta na vitória, pois a profecia se concretiza, trazendo harmonia duradoura ao Bosque Labiríntico.");
                        }
                        else if(opcao==3){
                          System.out.println("Os aventureiros oferecem um poderoso artefato mágico como símbolo de sua aliança. Entusiasmado com o presente, você decide aceitar sem considerar as possíveis consequências. No entanto, o artefato revela-se instável e, ao ativá-lo, desencadeia uma onda de energia destrutiva que derrota todos os presentes, incluindo você.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("Em vez de explorar o coração da floresta, você sugere investigar uma antiga ruína mágica para aprender sobre os seres que se escondem nas profundezas do Bosque Labiríntico. Infelizmente, ao adentrar a ruína, vocês despertam uma antiga entidade guardiã que não reconhece a aliança entre Minopiras e aventureiros. A entidade ataca, resultando na derrota de todos.");
                        P1.vida=0;
                      }
                  }
                  else if(opcao==3){
                    System.out.println("A luta é feroz, mas você, como Minopira, é poderoso. No entanto, durante o combate, um dos aventureiros consegue feri-lo gravemente. Você cai derrotado.");
                    P1.vida=0;
                  }
                }
                else if(opcao==2){
                  opcao=P1.setEscolha(3,"Você emerge de sua camuflagem e se apresenta aos estranhos com um sorriso amigável, explicando a importância da natureza. Eles parecem interessados em ouvir.Você decide falar de forma:","1 - Abordagem colaborativa","2 - Comunicação reflexiva","3 - Advertencia séria","");
                  if(opcao==1){
                    opcao=P1.setEscolha(2,"Optando por abordar os aventureiros de forma cooperativa, emerge de sua camuflagem e os recebe com um sorriso amigável. Explica a importância do Bosque Labiríntico e estabelece diretrizes para a exploração respeitosa do ambiente.\n\n Os aventureiros, impressionados com seu conhecimento, concordam em seguir suas orientações. Juntos, descobrem um antigo santuário escondido nas profundezas do bosque, repleto de artefatos preciosos. Você os orienta á:","1 - Manter a preservação do bosque","2 - Adentrar o santuario","","");
                    if(opcao==1){
                      opcao=P1.setEscolha(3,"Mesmo com suas advertências, os aventureiros, impacientes, adentram uma zona frágil do bosque, perturbando o equilíbrio ecológico. Enquanto tenta acalmar a situação, uma reação inesperada do ambiente se desencadeia, colocando todos em risco. Você sugere:","1 - Colaboração frutifera","2 - Advertência de impacto","3 - Defesa e Sacrifício","");
                      if(opcao==1){
                        System.out.println("Você acalma a floresta com sua conexão com os espiritos. Os aventureiros, tocados pela hospitalidade e sabedoria dos Minopiras, decidem preservar a beleza e a magia do local, evitando perturbar os artefatos. O equilibrio se restaura e todos vivem em paz e harmonia.");
                      }
                      else if(opcao==2){
                        opcao=P1.setEscolha(3,"Com sua habilidade e conhecimento, consegue ajudar os aventureiros a escapar da situação crítica. Contudo, a intrusão deixou marcas profundas no ecossistema, alertando-os para a delicadeza das ações humanas na floresta. Apesar dos esforços, a relação entre os grupos se vê tensionada devido aos impactos negativos causados pela exploração desavisada. O que  decide sugere?","1 - Colaboração Respeitosa","2 - Desvendar um novo caminho","3 - Ignorar os avisos da natureza","");
                        if(opcao==1){
                          System.out.printf("Optando por uma abordagem colaborativa desde o início, estabelece-se uma aliança produtiva com os aventureiros. Juntos, exploram o Bosque Labiríntico e descobrem um antigo santuário escondido nas profundezas da floresta. Enquanto investigam os artefatos, uma criatura ancestral é despertada, ameaçando a todos.\n\nCom habilidade e estratégia, você lidera o grupo na luta contra a criatura, encontrando uma maneira de acalmar a manifestação mágica, salvando os aventureiros e restaurando o equilíbrio no bosque. Essa colaboração bem-sucedida fortalece a relação entre Minopiras e aventureiros, deixando um legado de respeito mútuo e cooperação na preservação da natureza.");
                        }
                        else if(opcao==2){
                          opcao=P1.setEscolha(3,"Durante a jornada, descobrem um local misterioso com inscrições ancestrais. Ao decifrar os símbolos, percebem que indicam uma trilha secreta dentro do bosque.\n\n Seguindo essa trilha, encontram uma área remota do bosque que revela uma beleza natural extraordinária. Esta descoberta marca o início de uma nova fase na exploração, mostrando novos aspectos da natureza encantada do Bosque Labiríntico.\n\n A revelação deste novo caminho inspira a curiosidade do grupo, incentivando-os a prosseguir com sua exploração e descobrir mais sobre os mistérios que envolvem essa terra mágica. Com essa atmosfera vocês decidem","1 - Desvender os simbolos","2 - Declarar paz e submissão a floresta","3 - Destruir os simbolos","");
                          if(opcao==1){
                            System.out.printf("Ao investigar os simbolos voces descobrem descobrem indícios de uma antiga conspiração que ameaça a própria essência do bosque.\n\n O jogador Minopira lidera a busca pela verdade oculta, desvendando a conspiração sombria que ameaça o equilíbrio natural do bosque. Ao revelar a verdade, o jogador se sacrifica para conter os efeitos devastadores do plano maligno, assegurando que o Bosque Labiríntico permaneça protegido. Seu sacrifício é honrado e lembrado como um ato heróico de defesa da natureza e do equilíbrio do bosque");
                            P1.vida=0;
                          }
                          else if(opcao==2){
                            System.out.println("Neste momento, a natureza parece reagir positivamente à decisão do grupo, concedendo-lhes uma espécie de bênção. O ambiente se acalma e, em agradecimento à decisão respeitosa dos aventureiros, uma criatura protetora do bosque se manifesta, concedendo ao jogador Minopira um presente especial: uma aura protetora que aumenta sua resistência e sabedoria para enfrentar desafios futuros.");
                            System.out.println("Vitória");}
                          else if(opcao==3){
                            System.out.printf("Essa decisão perturba um espírito antigo do bosque, causando um desequilíbrio no ambiente. \n\n O jogador Minopira se sacrifica para enfrentar o espírito, buscando restaurar a harmonia no bosque. Com bravura e respeito, o jogador consegue acalmar a entidade e devolver a paz ao ambiente. Porém, esse sacrifício tem um custo alto, resultando na partida do jogador do plano material para garantir a harmonia duradoura no Bosque Labiríntico.");
                            P1.vida=0;
                          }
                        }
                        else if(opcao==3){
                          System.out.println("Você faz o possível para ajudar os aventureiros a escapar da situação crítica, porém, durante o tumulto, é acidentalmente atingido por uma consequência da manifestação mágica, resultando em sua morte. Sua passagem trágica serve como um alerta contundente sobre os perigos do desrespeito à natureza e a importância de preservar o equilíbrio do Bosque Labiríntico.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("Você intercede para protegê-los, enfrentando a ameaça em um ato de sacrifício. Seu esforço salva os aventureiros, porém, resulta em ferimentos graves. Apesar dos cuidados recebidos, não resistindo aos ferimentos, você sucumbe, deixando um legado como guardião do Bosque Labiríntico. Seu sacrifício é lembrado como um exemplo de devoção à natureza e à proteção da floresta.");
                        P1.vida=0;}
                    }
                    else if(opcao==2){
                      System.out.println("Enquanto exploram juntos, vocês encontram caçadores furtivos armados, prontos para atacar os aventureiros. Rapidamente, você os enfrenta para proteger os humanos, mas, infelizmente, é atingido por uma flecha envenenada durante a luta. Mesmo com seus esforços, o veneno se espalha rapidamente, deixando-o inconsciente e incapaz de defender os aventureiros. Com a ajuda dos humanos, você é levado para um local seguro, mas o veneno é forte demais, e você sucumbe, deixando o bosque desprotegido");
                      P1.vida=0;}
                  }
                  else if(opcao==2){
                    opcao=P1.setEscolha(3,"Explicando a importância da natureza e a conexão vital do Bosque Labiríntico com sua raça. Enquanto compartilha sua sabedoria sobre a ecologia do bosque, um dos aventureiros, fascinado com a floresta, faz uma pergunta inocente sobre uma árvore próxima.\n\n Você se aproxima para responder, mas percebe uma armadilha oculta posicionada por caçadores furtivos. Instantaneamente, alerta os aventureiros sobre o perigo iminente e, ágil, desvia da armadilha, evitando o ferimento. Os aventureiros, impressionados com sua destreza, expressam gratidão pela advertência. Juntos, exploram uma clareira oculta, descobrindo um santuário natural preservado. Os aventureiros, impactados pela experiência, comprometem-se a preservar a beleza e a integridade do Bosque Labiríntico após testemunharem sua resiliência e sabedoria em proteger esse lugar especial. Para manter a admiração dos aventureiros você decide","1 - Desafiar uma criatura guardiã","2 - Encontrar caçadores que se esgueiram pela floresta","3 - Demonstrar magia ancestral","");
                    if(opcao==1){
                      System.out.println("A criatura se mostra hostil, desafiando o grupo para um teste de habilidades e sabedoria. Durante o confronto, um dos aventureiros, tentando defender o grupo, é arrastado por uma poderosa rajada de energia lançada pela criatura, resultando na sua morte. A perda do companheiro é dolorosa, mas serve como um alerta sobre os perigos ocultos da floresta.");
                      P1.vida=0;
                    }
                    else if(opcao==2){
                      System.out.println("Enquanto exploram o santuário natural, vocês encontram os caçadores furtivos responsáveis pela armadilha. Os caçadores, determinados a capturar criaturas mágicas para seus próprios fins, confrontam o grupo. Uma batalha se inicia e, apesar dos esforços para proteger a todos, um dos aventureiros é gravemente ferido durante o conflito, resultando na sua morte. A perda do companheiro deixa todos profundamente abalados, reforçando o compromisso deles em proteger o bosque, mas ao custo de uma vida valiosa.");
                      P1.vida=0;
                    }
                    else if(opcao==3){
                      System.out.println("Uma antiga magia exige a energia vital de um dos presentes para restaurar o equilíbrio na floresta. Em um ato altruísta, um dos aventureiros se voluntaria para o sacrifício, oferecendo sua vida em prol do Bosque Labiríntico. A decisão é emocionalmente intensa e, embora a magia seja restaurada, a perda do aventureiro deixa uma marca profunda no grupo. Essa escolha dolorosa fortalece o compromisso dos sobreviventes em proteger e preservar a floresta. O efeito rebote da magia no entanto também atinge o Minopira");
                      P1.vida=0;
                    }
                  }
                  else if(opcao==3){
                    System.out.println("Você adverte os aventureiros sobre áreas proibidas do bosque devido à sua fragilidade ecológica. No entanto, eles ignoram suas advertências e avançam. Tentando bloquear seu caminho, um confronto se desencadeia.\n\nDurante o embate, um dos aventureiros, temendo por sua segurança, utiliza um artefato mágico para se defender, lançando um feitiço descontrolado. A energia mágica desencadeada o atinge, envolvendo seu corpo em chamas verdes. Enquanto sente a dor avassaladora, percebe a energia mágica consumir sua essência, lamentando profundamente não ter conseguido proteger seu lar da invasão.");
                    P1.vida=0;}
                }
                else if(opcao==3){System.out.println(" Sua desconfiança leva você a agir agressivamente contra os intrusos. Você carrega e ataca o grupo e morre.");
                                 P1.vida=0;}
            }
      else if(opcao==2){
                Raca Avatar = new Raca(95,55,5);
                Avatar.getAtributos();
                System.out.printf("Há muito tempo, em um mundo onde os povos eram divididos em quatro elementos - Água, Terra, Fogo e Ar - havia um Avatar, o último mestre do ar, destinado a manter o equilíbrio entre os povos e dominar todos os quatro elementos.");
                opcao=P1.setEscolha(3,"Um grupo de mestres do fogo te encontra,você decide:","1-Fugir","2-Se entregar","3-Lutar","");
                if(opcao==1){
                  System.out.println("1-A Revelação de P1: Um grupo de jovens mestres do Fogo descobre a existência do Avatar P1, cujo poder é considerado essencial para a supremacia dos povos do Fogo. Eles iniciam sua missão para capturá-lo.");
                  opcao=P1.setEscolha(3,"Você esta fugindo,quando de repente se da de cara com um precipicio.Diante de tal situação,você decide","1-Enfrenta os mestres do fogo","2-Tenta conversar com os mestres do fogo","3-Pula do precipicio","");
                  if(opcao==1){
                    System.out.println("Vida ou morte/n/nJovens mestres do Fogo caçam o Avatar P1 para usar seu poder para a supremacia do Fogo. P1 os enfrenta, descobre que são manipulados pelos Ceifadores da Harmonia e confronta a organização para impedir seus planos sinistros. P1 prevalece, restaurando o equilíbrio no mundo.");
                    opcao=P1.setEscolha(3,"Agora a paz restaurada,você estabelece a sua tribo e esta livre para seguir o seu proprio caminho,assim decidindo:","1-Treinar","2-Estudar diplomacia","3-Subjulgar as outras tribos","");
                    if(opcao==1){
                      System.out.println("Treinamento Intenso/n/n P1 decide dedicar um tempo para um treinamento intenso com os mestres da Água e Terra. Eles passam por um período de aprendizado acelerado, aprimorando suas habilidades nos elementos da Água eTerra, a fim de se tornar um Avatar mais poderoso. Durante esse treinamento, P1 também aprofunda seu conhecimento sobre como usar esses elementos para conter a expansão dos mestres do Fogo. Com seu treinamento completo, P1 se torna uma força formidável capaz de resistir aos mestres do Fogo.");
                      opcao=P1.setEscolha(3,"Apos treinar,você decide:","1-Tenta dominar os 4 elementos","2-Continuar treinando com outras tribos","3-Enfrentar os mestres do fogo sozinho","");
                      if(opcao==1){
                        System.out.println("Domínio dos Quatro Elementos/n/nP1 escolhe seguir o caminho do domínio completo dos quatro elementos. Eles dedicam-se a aprimorar suas habilidades no controle do Fogo e do Ar, além de suas habilidades já dominadas na Água e na Terra. Isso permite que P1 se torne um mestre supremo dos quatro elementos, tornando-se virtualmente imparável na luta contra os mestres do Fogo. Sua habilidade de usar todos os quatro elementos com maestria cria um poder formidável que é crucial para a resistência bem-sucedida contra a expansão do Fogo,e suas batalhas estão cada vez vai proxima.");
                        opcao=P1.setEscolha(3,"Apos dominar os 4 elementos,você que os mestres de fogo estão expandindo ainda mais seu territorio,você decide: ","1-Invadir o territorio para treinar com um mestre do fogo","2-Buscar uma reliquia perdida para ajudar na guerra","3-Atacar os mestres do fogo","");
                        if(opcao==1){
                          System.out.println("A soberba de P1/n/n P1 persistiu na busca pelo domínio dos quatro elementos, mas sua arrogância cresceu. Ao desafiar um mestre lendário do Fogo, subestimou a habilidade do oponente. No calor do duelo na arena antiga, P1 tentou manipular todos os elementos simultaneamente, resultando em uma explosão de poder descontrolado. A energia consumiu P1, deixando apenas destroços. Sua busca por domínio total acabou em tragédia, um lembrete de que a humildade é crucial mesmo para mestres poderosos.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("A Exploração/n/nP1, o intrépido explorador, buscava a Relíquia Perdida em Eldoria. Ao chegar a Zephyria, deparou-se com um enigma mágico nas ruínas. Ignorando os avisos, tentou resolver por conta própria. Manipulando runas, desencadeou uma magia descontrolada que trouxe ilusões e sombras ameaçadoras. O enigma revelou-se um teste de sabedoria, não apenas uma proteção. P1, exausto, sucumbiu à magia e sua busca terminou em fracasso. As ruínas ecoaram com a lembrança sombria de uma jornada malograda, e a Relíquia Perdida permaneceu intocada, aguardando um aventureiro mais sábio.");
                          P1.vida=0;
                        }
                        else if(opcao==3){
                          System.out.println("Confronto Decisivo/n/nP1, após a intensa preparação nos elementos da Água e da Terra, decide que é hora de confrontar os mestres do Fogo diretamente. Eles lideram um ataque ousado contra as forças dos mestres do Fogo, surpreendendo-os e pegando-os desprevenidos. Usando suas habilidades recém-aperfeiçoadas, P1 derrota os mestres do Fogo em uma série de batalhas emocionantes./n/nNo entanto, o verdadeiro ponto de virada ocorre quando P1 enfrenta o líder dos mestres do Fogo, Azula, em um confronto épico. Com habilidade e determinação, P1 supera Azula e a derrota, desmantelando assim a liderança dos mestres do Fogo e enfraquecendo sua expansão. A vitória de P1 inspira as nações da Água e da Terra, levando à formação de uma poderosa aliança para continuar resistindo contra os mestres do Fogo e restaurar o equilíbrio no mundo./n/nEste caminho permite que P1 assuma o papel de um herói que confronta diretamente a ameaça dos mestres do Fogo e emerge vitorioso, desempenhando um papel fundamental na restauração do equilíbrio.");
                          System.out.println("Vitoria");
                        }
                      }
                      else if(opcao==2){
                        System.out.println("O Fortalecimento das Alianças/n/nP1 continua a aprimorar suas habilidades nos elementos da Água e da Terra, tornando-se um mestre consumado de ambos. No entanto, em vez de entrar em conflito direto com os mestres do Fogo, P1 concentra seus esforços em fortalecer alianças com outras nações e mestres elementares. Eles viajam por diferentes terras para ganhar o apoio de mestres de diferentes elementos, unindo-os para enfrentar a ameaça dos mestres do Fogo em uma frente unificada.");
                        opcao=P1.setEscolha(3,"No ápice de sua viagem em busca de aliados,seus suditos estao cansados e te pedem uma decisão final,você decide","1-Tentar negociar aliança com uma tribo traiçoeira","2-Retornar e começar a invasão","Invadir um templo ancestral em busca de armas elementais","");
                        if(opcao==1){
                          System.out.println("Traição Erronea/n/nApesar dos esforços de P1 em fortalecer alianças, uma reviravolta trágica ocorre quando uma nação rival tenta sabotar as negociações, semear a discórdia entre os aliados. Ignorando os sinais de traição, P1 decide prosseguir com a aliança, confiante em sua habilidade diplomática. No momento crítico, durante uma reunião crucial, uma emboscada é desencadeada, resultando em um confronto mortal. P1, surpreendido pela traição, luta bravamente, mas é subjugado por forças esmagadoras. Seu sonho de unir os elementos desmorona, enquanto P1 perece nas mãos daqueles que exploraram sua confiança. A notícia de sua morte ressoa como um alerta sobre os perigos de confiar cegamente, apesar das nobres intenções.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("O Cerco/n/nApós estabelecer alianças com nações da Água, da Terra e do Ar, P1 lidera uma coalizão unificada contra os mestres do Fogo, que ameaçam o equilíbrio mundial. Juntos, eles lançam ataques coordenados, enfraquecendo o domínio do Fogo. No clímax, P1 enfrenta Azula, a líder dos mestres do Fogo, em uma batalha intensa. Com apoio e habilidades elementares combinadas, P1 derrota Azula, restaura a paz e a harmonia no mundo, destacando o poder da cooperação e da união entre nações.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("A Queda do Herói/n/nEnquanto P1 buscava a perfeição nas armas elementais, uma sombra ancestral o desafiou para um duelo final. Determinado a provar sua supremacia, P1 aceitou, ignorando avisos sobre a natureza sinistra do oponente. O confronto foi épico, mas P1, sobrecarregado pela força sombria, sucumbiu heroicamente para salvar seus suditos e a terra que jurara proteger. Seu sacrifício ecoou como um lamento pelos elementos, e sua memória foi honrada como um lembrete da fragilidade dos mais poderosos.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("A Queda do Avatar/n/nApós concluir o treinamento intenso, P1 sente uma confiança imensa em suas habilidades. Convencido de que pode enfrentar os mestres do Fogo sozinho, decide tomar uma decisão arriscada. Em uma batalha épica, P1 confronta os mestres do Fogo sem apoio, subestimando a intensidade de seu poder. Sua decisão solitária prova-se fatal, e o Avatar sucumbe diante das chamas, deixando um vazio na luta contra a expansão do Fogo.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==2){
                      System.out.println("Diplomacia e Alianças/n/n P1 decide buscar uma abordagem mais diplomática para conter a expansão das outras tribos.Eles embarcam em uma jornada para negociar alianças com outras nações em busca de apoio na luta contra os mestres do Fogo. P1 usa suas habilidades como o Avatar para unir as nações da Água, da Terra e do Ar em uma frente comum contra a ameaça dos mestres do Fogo. Essa abordagem estratégica resulta em uma coalizão poderosa que tem o potencial de resistir eficazmente à expansão do Fogo.");
                      opcao=P1.setEscolha(3,"A sua abordagem esta dando certo,diante disso,voce decide:","1-Se infiltrar na tribo do fogo","2-Buscar novas alianças","3-Trair uma tribo aliada","");
                      if(opcao==1){
                        System.out.println("Missão de Infiltração/n/nEm vez de buscar alianças abertas, P1 opta por uma abordagem de infiltração. Eles enviam um grupo de mestres da Água e da Terra em uma missão secreta para influenciar as fileiras dos mestres do Fogo de dentro. Esta estratégia requer táticas de espionagem, disfarce e persuasão para minar o domínio do Fogo por dentro. A narrativa se concentra em operações secretas e nas escolhas morais complexas que P1 e seus agentes enfrentam ao se infiltrar no inimigo.");
                        opcao=P1.setEscolha(3,"No auge da operação,você percebe que tambem esta sendo invadido,você decide:","1-Agiliza a operação","2-Desiste da opreção secreta e ataca","3-Vai direto para a ultima sala dos mestres do fogo","");
                        if(opcao==1){
                          System.out.println("O Desfecho da Infiltração/n/nEm um momento crítico da missão de infiltração, P1, movido pela pressa em obter informações cruciais, ignora as precauções sugeridas por seus aliados. Ao se expor inadvertidamente, é capturado pelos mestres do Fogo. Sua decisão imprudente coloca em risco não apenas sua própria vida, mas compromete toda a missão. Em meio a um confronto tenso, P1 enfrenta as consequências de sua escolha precipitada, sucumbindo aos ataques dos mestres do Fogo. Sua morte serve como um lembrete trágico de que a pressa e a imprudência podem anular até mesmo as estratégias mais elaboradas.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Cavalo de Troia/n/nP1 e seu grupo de infiltrados revelam um plano de ataque dos mestres do Fogo. Abandonando seus disfarces, eles lideram um contra-ataque épico, derrotando os mestres do Fogo e evitando o ataque planejado. A vitória restaura a paz, destacando a coragem de fazer escolhas difíceis e a importância da cooperação para vencer adversidades.");
                        }
                        else if(opcao==3){
                          System.out.println("O Submundo das Sombras/n/nDecidindo explorar o submundo mágico pouco conhecido, P1 e seus aliados buscam informações cruciais sobre os mestres do Fogo. Em sua busca por segredos sombrios, P1 depara-se com um artefato mágico proibido. Ignorando as advertências de seus companheiros, decide ativá-lo na esperança de obter um poder formidável. No entanto, a magia negra que é liberada se volta contra P1, consumindo-o em trevas incontroláveis. Sua decisão imprudente resulta na própria perdição, lançando uma sombra sinistra sobre a missão e destacando os perigos de se aventurar nos recantos desconhecidos da magia é acaba deixando seu legado.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        System.out.println("Desafios Internos Enquanto P1 continua a buscar alianças, surgem desafios internos dentro da coalizão. Diferenças culturais e históricas entre as nações da Água, da Terra e do Ar começam a minar a unidade. P1 deve agir como mediador, resolvendo conflitos e mantendo a aliança coesa. Essa narrativa destaca os desafios da diplomacia e da manutenção de alianças em face de adversidades internas.");
                        opcao=P1.setEscolha(3,"Devido a grande variadade de culturas,o clima fica tenso entre a grande aliança,diante disso,você decide:","1-Tentar resolver tudo sozinho","2-Tentar pedir ajuda celestial","3-Tentar mostrar que podem trabalhar juntos","");
                        if(opcao==1){
                          System.out.println("O Colapso da Unidade/n/nPercebendo as crescentes tensões entre as nações aliadas, P1, num momento de desespero, decide impor uma solução unilateral para resolver os conflitos. Sua decisão precipitada, longe de resolver as diferenças, intensifica as hostilidades. Em uma reviravolta trágica, P1 é traído por um aliado descontente e é morto durante uma negociação que deu errado. Sua morte serve como um trágico lembrete dos perigos da impulsividade e da falta de cooperação, deixando a coalizão em desordem e enfraquecida diante dos mestres do Fogo.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("O Confronto Celestial/n/nP1, ao enfrentar desafios cósmicos durante a busca por aliados celestiais,descobre que forças divinas estão em desacordo quanto à interferência nos assuntos humanos. Determinado a unir os reinos celestiais para proteger a Terra, P1 decide convocar uma reunião divina sem considerar as consequências. Durante o encontro, uma entidade celestial, irritada com a audácia de P1, lança um raio que o atinge diretamente. Sua morte serve como um lembrete doloroso da fragilidade humana diante de forças divinas e das consequências de desafiar o equilíbrio celestial.");
                          P1.vida=0;
                        }
                        else if(opcao==3){
                          System.out.println("União Contra a Traição/n/nÀ medida que as diferenças internas ameaçam minar a coalizão, P1 se esforça para manter a unidade e superar a desconfiança mútua. No entanto, durante uma reunião crítica, uma facção radical de mestres do Fogo dentro da aliança tenta traí-la e aliar-se ao restante dos mestres do Fogo./n/nP1 e seus aliados lutam para conter a traição, desencadeando uma batalha interna entre a facção traidora e a coalizão. A luta pelo controle da aliança atinge o seu auge em uma batalha intensa e emocionante./n/nNo confronto final, P1 e os aliados leais emergem vitoriosos, derrotando a facção traidora e reafirmando a unidade da coalizão. Eles também ganham a confiança das nações da Água, da Terra e do Ar, restaurando a aliança e fortalecendo-a. Isso destaca a importância da superação de desafios internos e da manutenção da coesão em busca de um objetivo comum.");
                          System.out.println("Vitoria");
                        }
                      }
                      else if(opcao==3){
                        System.out.println("A Queda da Diplomacia/n/nApesar do sucesso inicial na formação da coalizão, P1, em um momento de excesso de confiança, decide romper uma aliança crucial para ganhar vantagem estratégica. Essa decisão, motivada por um desejo egoísta de poder, enfraquece a coesão da frente unificada. Os mestres do Fogo exploram essa divisão, lançando um ataque surpresa devastador. P1, isolado e sem o apoio esperado, enfrenta os mestres do Fogo sozinho. Seu sacrifício, uma consequência de sua decisão imprudente, deixa a coalizão em ruínas e o mundo à mercê da expansão implacável do Fogo.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==3){
                      System.out.println("A Queda da Razão/n/nEm um momento de imprudência, P1, dominado pela confiança excessiva, decide invadir uma tribo sozinho, acreditando que é suficiente para vencê-los. Ignorando os apelos de seus aliados, ele avança em um confronto desigual. Os moradores, cientes de sua decisão precipitada, aproveitam-se de sua vulnerabilidade e armam uma emboscada mortal. P1, superado em número e estratégia, sucumbe á a propria soberba.");
                      System.out.println("Sua morte serve como um lembrete amargo de que a arrogância pode ser a queda até mesmo dos mais poderosos, deixando o mundo sem a proteção vital do Avatar contra a expansão do Fogo.");
                      P1.vida=0;
                    }
                  }
                  else if(opcao==2){
                    System.out.println("Diplomacia e Negociação/n/n P1, enquanto aprimora suas habilidades nos elementos da Água e da Terra, usa seu conhecimento para negociar com os mestres do Fogo de forma diplomática. Em vez de entrar em conflito, eles buscam uma solução pacífica e um acordo que possa conter a expansão do Fogo sem derramamento de sangue. P1 atua como um embaixador entre as nações, promovendo o diálogo e a negociação para resolver as tensões e restaurar o equilíbrio no mundo.");
                    opcao=P1.setEscolha(3,"Você percebe que não existe equilíbrio com os mestres do fogo,você decide:","1-Se tornar um espião","2-Buscar aliados para atacar os mestres do fogo","Desafiar o lider dos mestres do fogo pelo trono","");
                    if(opcao==1){
                      System.out.println("Caminho 1: Espionagem e Infiltração P1, percebendo que a diplomacia pode não ser suficiente para conter a ameaça iminente dos mestres do Fogo, decide seguir um caminho mais sutil. Utilizando suas habilidades recém-aprimoradas nos elementos do Ar e da terra, P1 se infiltra nas fileiras dos mestres do Fogo para obter informações cruciais sobre seus planos. Ao descobrir suas intenções, P1 busca maneiras de desmantelar a ameaça de dentro para fora, sem que a guerra se torne inevitável.");
                      opcao=P1.setEscolha(3,"Você esta caminhando pelo templo de fogo quando se da de cara com um grupo fazendo um ritual,você decide:","1-Tentar achar aliados para a traição","2-Estudar o ritual","3-Acabar com o ritual","");
                      if(opcao==1){
                        System.out.println("Rebelião Subterrânea/n/nP1, ao infiltrar-se nas fileiras dos mestres do Fogo, descobre que há uma facção dissidente entre eles descontente com os planos de expansão agressiva. P1 decide unir forças com essa facção rebelde, formando uma aliança secreta para conter a ameaça de dentro. Juntos, planejam sabotagens e desinformações para desestabilizar a liderança do Fogo e evitar uma guerra em grande escala. No ápice da tensão, P1 lidera a facção rebelde em uma batalha subterrânea contra os líderes do Fogo, usando táticas astutas e habilidades elementares para emergir vitoriosos.");
                        opcao=P1.setEscolha(3,"Com a sua nova facção dissidente,você recebe uma informação sobre uma troca crucial para os mestres do fogo,chegando la,você percebe que o lider tambem esta presente,você decide:","1-Enfrentar o Lider dos mestres do fogo","2-Sabotar a troca","3-Interceptar e enfrentar o trocador","");
                        if(opcao==1){
                          System.out.println("A Queda do Líder Rebelde/n/nEm um momento de confiança excessiva, P1, agora líder da facção dissidente, decide confrontar diretamente o mestre supremo do Fogo em uma tentativa audaciosa de encerrar o conflito de uma vez por todas. Ignorando os conselhos cautelosos de seus aliados, P1 avança sozinho. No confronto, sua ousadia é sua ruína, e ele é dominado pela fúria ardente do mestre do Fogo. Sua morte serve como uma dolorosa lição sobre os perigos da arrogância e da subestimação dos inimigos, deixando a rebelião subterrânea em desordem e marcando o fim prematuro da esperança de uma paz duradoura.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("O Sabotador/n/nP1, infiltrado entre os mestres do Fogo, une-se a uma facção rebelde insatisfeita. Juntos, planejam sabotagens para desestabilizar os líderes do Fogo. Em uma batalha subterrânea, P1 lidera os rebeldes, usando habilidades elementares para emergir vitoriosos. No confronto final, P1 derrota o líder supremo dos mestres do Fogo, restaurando o equilíbrio. A aliança é mantida em segredo, e P1 emerge como herói, influenciando positivamente as relações entre as nações e preservando a harmonia elemental.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("A Traição Subaquática/n/nEnquanto P1 se infiltra nas fileiras dos mestres do Fogo, descobre uma conspiração sombria liderada por um traidor na facção rebelde aquática. Ignorando as advertências, P1 confronta o traidor para impedir a entrega de informações cruciais aos mestres do Fogo. Na intensa batalha subaquática que se segue, P1 é subjugado pelas habilidades traiçoeiras do conspirador, resultando em sua morte nas profundezas do oceano.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        System.out.println("Ritual de Selamento/n/nP1, ao descobrir as intenções dos mestres do Fogo, procura conhecimento antigo sobre um poderoso ritual de selamento. Com a ajuda de anciãos e estudiosos, P1 aprende a realizar um ritual que, se executado corretamente, pode selar temporariamente os poderes dos mestres do Fogo, impedindo-os de causar estragos. P1 embarca em uma jornada para reunir os ingredientes necessários e encontrar um local sagrado para realizar o ritual. No clímax da história, P1 enfrenta os mestres do Fogo em um confronto intenso enquanto tenta completar o ritual, enfrentando desafios mágicos e físicos para proteger o mundo da ameaça iminente.");
                        opcao=P1.setEscolha(3,"Você se vê encurralado pelos mestres do fogo e precisa tomar uma decisão,você","1-Faz um simples ritual de selo","2-Busca outra solução","3-Faz um super ritual de selo","");
                        if(opcao==1){
                          System.out.println("O Selo Final/n/nCom os ingredientes reunidos, P1 realiza o ritual de selamento diante dos mestres do Fogo. Uma batalha mágica se desenrola, mas P1, usando habilidades do Ar e da Terra, completa o ritual, enfraquecendo os mestres do Fogo. Apesar de uma última investida, P1 prevalece, neutralizando a ameaça. Celebrado como guardião do equilíbrio, P1 promove a paz entre as nações e o mundo encontra estabilidade novamente.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==2){
                          System.out.println("O Portal Dimensional/n/nP1, ao buscar uma solução para conter os mestres do Fogo, descobre a existência de um antigo portal dimensional capaz de aprisionar os adversários em uma realidade paralela. Com a orientação de sábios interdimensionais, P1 inicia o complexo processo para ativar o portal. No ápice da cerimônia, P1, movido por uma decisão apressada, ultrapassa os limites mágicos permitidos, abrindo uma fenda incontrolável. O portal, ao invés de conter os mestres do Fogo, consome P1. Sua morte serve como uma advertência trágica sobre as consequências imprevisíveis de manipular forças além da compreensão humana.");
                          P1.vida=0;
                        }
                        else if(opcao==3){
                          System.out.println("O Último Suspiro do Ritual/n/nNo momento crucial do ritual, P1, tomado por uma decisão impulsiva, decide canalizar mais poder do que seu corpo pode suportar para reforçar o selamento. Seu ato audacioso leva a uma sobrecarga mágica, causando danos irreversíveis. Enquanto o selamento é temporariamente bem-sucedido, P1 cai exausto e debilitado. Sua visão se apaga lentamente, e P1 sucumbe, deixando para trás um mundo temporariamente seguro, mas a um custo doloroso. Sua morte serve como um lembrete sombrio de que, mesmo nas intenções mais nobres, a imprudência pode cobrar um preço terrível.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("O Fim da Infiltração/n/nEnquanto P1 prossegue com sua missão de infiltração, uma escolha impulsiva coloca sua disfarçada identidade em risco. Ao tentar sabotar um importante ritual dos mestres do Fogo, P1 é descoberto e cercado. Ignorando os apelos para recuar, P1 enfrenta os mestres do Fogo sozinho. Na intensa batalha que se segue, P1 sucumbe às chamas ardentes, sua morte trágica evidenciando os perigos de subestimar a astúcia dos inimigos e a necessidade de ponderação em momentos cruciais.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==2){
                      System.out.println("Aliança Proibida/n/n P1, sentindo a urgência da situação, decide buscar uma aliança inusitada. Ao explorar os elementos proibidos da Mágica, P1 entra em contato com um grupo de praticantes de magia negra que compartilham um interesse comum em conter a expansão descontrolada do Fogo. Embora esta aliança seja arriscada e controversa, P1 acredita que a combinação única de poderes pode ser a chave para superar a ameaça iminente. Este caminho exige que P1 equilibre a linha tênue entre o bem e o mal, enquanto trabalha com aliados improváveis para proteger o mundo.");
                      opcao=P1.setEscolha(3,"Embora os praticantes de magia negra sejam fortes,você percebe que são tão perigosos quanto,você decide:","1-Converte-los","2-Abandonalos e procurar divindades","3-Se tornar igual a eles","");
                      if(opcao==1){
                        System.out.println("Expiação e Redenção/n/nP1, ciente dos riscos da aliança proibida, busca redimir os aliados de magia negra, guiando-os para um caminho mais ético. P1 usa sua influência para direcionar o poder do grupo em direção à contenção do Fogo, evitando métodos obscuros. Juntos, eles enfrentam os mestres do Fogo em uma batalha que testa a força da redenção. P1, ao final, busca encontrar um equilíbrio entre o uso responsável da magia e a manutenção da paz, marcando uma transformação positiva na aliança e contribuindo para a harmonia no mundo.");
                        opcao=P1.setEscolha(3,"No auge da batalha,você percebe que está perdendo a batalha,em um ato de desespero,você decide:","1-Recorrer a magia sombria","2-Recorrer aos 4 elementos","3-Recorrer ao ritual proibido","");
                        if(opcao==1){
                          System.out.println("A Queda da Redenção/n/nApesar dos esforços para redimir a aliança, P1, em um momento de desespero, decide recorrer a métodos sombrios para derrotar os mestres do Fogo. A magia negra, que outrora buscara conter, consome P1, corroendo sua essência. Sua decisão imprudente culmina em sua própria perdição, deixando um vazio na busca pela redenção. A aliança, agora desprovida de sua liderança, enfrenta uma escuridão inevitável, ressaltando os perigos de se desviar do caminho da redenção e equilíbrio.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Redenção através da Habilidade Elemental/n/nP1, comprometido com a redenção, guia os aliados de magia negra para uma abordagem ética e responsável. Treinam intensivamente para canalizar suas habilidades sombrias em elementos controláveis, transformando a magia negra em uma força benigna. Na batalha contra os mestres do Fogo, P1 lidera a aliança em uma demonstração de poder elemental equilibrado, usando a magia transformada para conter as chamas ardentes. A vitória não só representa a redenção dos aliados, mas também destaca a possibilidade de reabilitação de poderes obscuros em prol do bem.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("A Sombra Crescente/n/nP1, em sua busca pela contenção do Fogo, decide se aprofundar nas artes ocultas em busca de um conhecimento proibido. Durante o ritual, P1 perde o controle sobre as energias sombrias, que o envolvem em uma espiral crescente de escuridão. Sua morte serve como um lembrete sombrio dos perigos de se aventurar nos domínios desconhecidos da magia, pagando um preço alto pela tentativa de conter uma ameaça iminente.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        System.out.println("Desafio aos Deuses/n/nP1, em vez de buscar aliados entre praticantes de magia negra, decide desafiar as divindades responsáveis pelos elementos. Com uma ousada demonstração de suas habilidades, P1 busca chamar a atenção das entidades divinas para que intervirem na situação. A batalha cósmica que se desenrola testa os limites das capacidades de P1, que busca persuadir as divindades a agirem em prol da harmonia. Ao final, o sucesso dessa abordagem única redefine a relação entre os seres elementares e os humanos, trazendo uma ordem equilibrada ao mundo.");
                        opcao=P1.setEscolha(3,"Diante dos Deuses,eles te dão 3 opções:","1-Lutar por poder","2-Lutar por quem voçê ama","3-Lutar por riquezas","");
                        if(opcao==1){
                          System.out.println("A Queda do Desafiante Divino/n/nImpulsionado por um desejo insaciável de poder, P1 decide absorver uma quantidade excessiva de energia divina para alcançar a supremacia. Entretanto, sua ambição desmedida o consome, levando à sua própria destruição. No auge de sua imprudência, P1 sucumbe diante das forças celestiais, enfrentando uma morte inevitável. Sua queda serve como um lembrete sombrio de que desafiar os limites divinos pode ter consequências fatais, deixando o mundo em luto pela perda do destemido desafiante.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Ascensão Cósmica/n/nDesafiando diretamente as divindades elementares, P1 conquista uma aliança cósmica. Com esse poder, lidera uma batalha épica contra os mestres do Fogo. Utilizando forças celestiais, P1 sela temporariamente os poderes dos inimigos. Reconhecendo a coragem de P1, as divindades fortalecem o vínculo entre seres elementares e humanos. P1, agora um guardião venerado, assegura a estabilidade do mundo, selando um novo equilíbrio cósmico.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("A Queda do Desafiante Divino/n/nImpulsionado por um desejo insaciável de poder, P1 decide absorver uma quantidade excessiva de energia divina para alcançar a supremacia. Entretanto, sua ganancia desmedida o consome, levando à sua própria destruição. No auge de sua imprudência, P1 sucumbe diante das forças celestiais, enfrentando uma morte inevitável. Sua queda serve como um lembrete sombrio de que desafiar os limites divinos pode ter consequências fatais, deixando o mundo em luto pela perda do destemido desafiante.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("O Preço da Escuridão/n/nDesconsiderando os avisos dos aliados, P1 mergulha mais profundamente nas artes sombrias para fortalecer a aliança proibida. No ápice da batalha contra os mestres do Fogo, a magia negra se volta contra P1, consumindo-o em uma espiral de escuridão. Sua decisão imprudente resulta em sua própria perdição, deixando um vácuo de poder e desespero entre os aliados improváveis. A aliança, agora desestabilizada pela morte de P1, revela-se um pacto condenado, destacando os perigos de se arriscar nos reinos proibidos da magia.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==3){
                      System.out.println("O Último Desafio/n/nAo se deparar com a resistência dos mestres do Fogo, P1, dominado pela impaciência, decide desafiar seu líder para um duelo decisivo. Ignorando as advertências de seus aliados, ele enfrenta o mestre do Fogo em uma batalha intensa. No entanto, sua precipitação se prova fatal quando subestima o verdadeiro poder do adversário.Envolto em chamas incontroláveis, P1 luta corajosamente, mas é consumido pela intensidade do fogo. Sua morte ecoa como um aviso sobre a fragilidade mesmo dos mais habilidosos quando confrontados com escolhas impulsivas.");
                      P1.vida=0;
                    }
                  }
                  else if(opcao==3){
                    System.out.println("A má escolha de P1/n/nO jovem Avatar pula do precipicio e tenta atravesar sozinho pelo mar,onde acaba morrendo afogado.");

                  }
                }
                else if(opcao==2){
                  System.out.println("2-A Captura de P1/n/nOs mestres do Fogo capturam P1 e o mantêm prisioneiro em segredo, impedindo-o de cumprir seu destino de equilibrar o mundo. Enquanto isso, os povos do Fogo continuam expandindo seu domínio.");
                  opcao=P1.setEscolha(3,"Você esta preso,diante disso você decide:","1-Esperar ajuda","2-Manipular os guardas","3-Fugir da prisão","");
                  if(opcao==1){
                    System.out.println("O Declineo de P1/n/nSeus amigos esqueceram de você e você acabou definhando na prisão");
                    P1.vida=0;
                  }
                  else if(opcao==2){
                    System.out.println("Jogo Político Sutil/n/nEnquanto prisioneiro, P1 observa as dinâmicas internas dos mestres do Fogo. Descobre intrigas e divisões entre eles. Com habilidades diplomáticas e persuasivas, P1 trabalha nos bastidores para semear discórdia entre os líderes dos povos do Fogo. Aproveitando-se das tensões internas, os mestres do Fogo ficam enfraquecidos, permitindo a P1 uma chance estratégica de escapar e, ao mesmo tempo, desmantelar a coesão dos inimigos. Essa abordagem não apenas liberta P1, mas cria oportunidades para enfraquecer a expansão dos povos do Fogo de maneira mais sutil."); 

                    opcao=P1.setEscolha(3,"Apos manipular os guardas,você decide:","1-Implantar uma revolução","Fazer um pacto","Fugir da prisão","");
                    if(opcao==1){
                      System.out.println("Aliança Fragilizada/n/nA manipulação sutil de P1 resulta em uma quebra temporária da aliança entre os mestres do Fogo. As tensões internas eclodem em disputas abertas, desviando a atenção deles da ameaça iminente. P1, ao escapar, encontra aliados entre os dissidentes e forma uma aliança improvável para conter a expansão dos povos do Fogo. A batalha subsequente é marcada por traições internas e reviravoltas políticas, enquanto P1 busca manter a aliança fragilizada unida o suficiente para enfrentar os mestres do Fogo.");
                      opcao=P1.setEscolha(3,"Você escuta conversas sobre traição na facção,você opta por:","1-Remover os traidores","2-Subjulgar os traidores","3-Ignorar as conversas","");
                      if(opcao==1){
                        System.out.println("Renascimento das Cinzas/n/nP1, ao perceber a hesitação dentro da aliança dissidente, decide adotar uma abordagem mais radical. Em vez de buscar a reconciliação, P1 opta por reformular a aliança, removendo membros descontentes e substituindo-os por aliados mais confiáveis. A batalha subsequente é marcada não apenas pela luta contra os mestres do Fogo, mas também por confrontos internos enquanto P1 molda uma nova e mais coesa frente contra a ameaça.");
                        opcao=P1.setEscolha(3,"No auge do confronto final,você e sua aliança se veem encurralados pelos mestres do fogo,assim decidindo:","1-Lutar a qualquer custo","2-Lutar com sabedoria","3-Lutar com bravura","");
                        if(opcao==1){
                          System.out.println("Ascensão e Queda da Nova Ordem/n/nP1, ao reestruturar a aliança, enfrenta resistência interna, desencadeando uma batalha política enquanto confronta os mestres do Fogo. No auge da luta, P1, agora líder de uma aliança mais coesa, sacrifica-se para garantir a vitória. Sua morte, entretanto, deixa a nova ordem vulnerável às disputas internas, levando à desintegração da aliança reformulada.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Renascimento na Batalha Épica/n/nDiante da reconfiguração da aliança dissidente, P1 lidera os aliados mais confiáveis em uma batalha épica contra os mestres do Fogo. A vitória é conquistada não apenas pela força bruta, mas pela capacidade de P1 de unir os aliados em torno de um objetivo comum. Com os mestres do Fogo derrotados, P1 emerge como o arauto do renascimento, restaurando a harmonia entre os elementos e garantindo um futuro equilibrado para o mundo.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("Chamas da Renovação/n/nMesmo após uma reorganização bem-sucedida da aliança, P1 percebe que o verdadeiro desafio é manter a coesão. Em uma batalha final intensa, P1 lidera com bravura, sacrificando-se para assegurar a vitória. Seu legado, entretanto, é a chama da renovação que inspira os sobreviventes a continuarem unidos. A aliança, apesar da perda de P1, floresce como um símbolo da superação das cinzas.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==2){
                        System.out.println("Dominação Elemental/n/nDiante das discordâncias internas, P1 decide canalizar seus poderes para subjugar a resistência dentro da aliança dissidente. P1 utiliza uma demonstração impressionante de habilidades mágicas para impor autoridade, transformando a aliança em uma força mais disciplinada. A batalha contra os mestres do Fogo torna-se uma exibição de domínio elemental, com P1 liderando uma aliança agora mais controlada rumo à vitória.");
                        opcao=P1.setEscolha(3,"No auge do confronto final,você e sua aliança se veem encurralados pelos mestres do fogo,assim decidindo:","1-Enviar sua facção na frente","2-Lutar lado a lado com a sua facção","3-Ir na frente de sua facção","");
                        if(opcao==1){
                          System.out.println("O Controle Efêmero/n/nP1, ao subjugar a resistência, alcança uma vitória temporária sobre os mestres do Fogo. No entanto, a dominação gera ressentimento interno. Na batalha final, P1 sacrifica-se para proteger a aliança controlada, mas sua morte desencadeia um levante. A aliança, agora liberta, enfrenta um futuro incerto após a partida de P1.");
                          P1.vida=0;
                        }
                        else if(opcao==2){
                          System.out.println("Caminho Final/n/nDominação Elemental Triunfante/n/nCom a aliança dissidente subjugada e transformada em uma força disciplinada, P1 lidera uma ofensiva imparável contra os mestres do Fogo. A batalha culmina em uma exibição magistral de domínio elemental, onde P1 e sua aliança controlada derrotam os mestres do Fogo de forma espetacular./n/nO triunfo de P1 não apenas assegura a derrota dos mestres do Fogo, mas também estabelece uma nova ordem onde P1 domina não apenas os elementos, mas também as nações que uma vez resistiram. Com a vitória completa, P1 impõe sua visão de equilíbrio, moldando um mundo sob seu controle, marcando uma era de dominação elemental incontestável.");
                          System.out.println("Vitoria");
                        }
                        else if(opcao==3){
                          System.out.println("O Último Ataque de P1 Em um espetáculo de domínio elemental, P1 lidera a aliança para a vitória contra os mestres do Fogo. Entretanto, ao alcançar o triunfo, P1 percebe os custos de sua busca pela disciplina. No último ato de redenção, ele se sacrifica para libertar a aliança do domínio, deixando seus aliados com a responsabilidade de construir um futuro baseado na verdadeira união, longe da manipulação elemental.");
                          P1.vida=0;
                        }
                      }
                      else if(opcao==3){
                        System.out.println("Dança das Sombras/n/nP1, imerso na dança política, manipula eventos nos bastidores para desestabilizar os mestres do Fogo. Contudo, a sociedade secreta exige um preço alto pelo suporte. No momento crucial, P1 sacrifica-se para manter o equilíbrio, revelando sua influência apenas após a morte. A aliança, agora ciente de seu papel nas sombras, continua a luta em homenagem ao estrategista que conduziu a dança final.");
                        P1.vida=0;
                      }
                    }
                    else if(opcao==2){
                      System.out.println("O Preço do Pacto/n/nVocê acabou se auto destruindo com o pacto.");
                      P1.vida=0;
                    }
                    else if(opcao==3){
                      System.out.println("O Último Sopro de Intriga P1, ao desmantelar as alianças internas dos mestres do Fogo, cria uma oportunidade para a fuga. Durante a batalha final, P1 sacrifica-se para manter viva a discórdia entre os líderes inimigos. Seu último sopro de intriga resulta na desintegração dos mestres do Fogo, permitindo que seus aliados alcancem a vitória, mas a morte de P1 deixa um vazio estratégico na resistência.");
                      P1.vida=0;
                    }
                  }
                  else if(opcao==3){
                    System.out.println("O Último Suspiro de P1/n/nP1, confinado em sua prisão, decide tentar uma fuga audaciosa para impedir a expansão dos mestres do Fogo. Contudo, sua tentativa imprudente é descoberta pelos guardas, resultando em um confronto desigual. P1 luta com bravura, mas é subjugado pelas chamas furiosas dos mestres do Fogo. Sua morte dentro das garras do inimigo ressalta a triste ironia de seu destino, enquanto o mundo continua a sucumbir ao desequilíbrio, sem seu Avatar para protegê-lo.");
                    P1.vida=0;
                  }
                }
                else if(opcao==3){
                  System.out.println("3-O declineo de P1/n/n O jovem Avatar decide enfrentar os mestres do fogo e acaba sendo morto");
                  P1.vida=0;
                }

    }
      else if(opcao==3){
        System.out.println("Escolha a quantidade de opções");
        int quantidadeDeEscolha = entrada.nextInt();
        System.out.println("Digite o prelúdio da escolha");
        String preludio = entrada.nextLine();
        System.out.println("Digite a escolha número 1");
        String escolha1 = entrada.nextLine();
        System.out.println("Digite a escolha número 2");
        String escolha2 = entrada.nextLine();
        System.out.println("Digite a escolha número 3");
        String escolha3 = entrada.nextLine();
        System.out.println("Digite a escolha número 4");
        String escolha4 = entrada.nextLine();
        Escolha escolha = new Escolha(quantidadeDeEscolha,preludio,escolha1,escolha2,escolha3,escolha4);
        opcoesCriadas.add(escolha);
      }
      else if(opcao==4){
        System.out.println("Ainda em desenvolvimento");
      }
    }
    P1.getStatus();
    System.out.println("Você perdeu!! Até a próxima ");
  }
}