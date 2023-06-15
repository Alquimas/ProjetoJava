package bancoDeDados;
import java.util.*;

public class BancoDados {
        private ArrayList<ArrayList<ModeloQuestao>> questoes = new ArrayList<>();

        public BancoDados() {
            questoesFaceis faceis = new questoesFaceis();
            questoesMedias medias = new questoesMedias();
            questoesDificeis dificeis = new questoesDificeis();
            this.questoes.add(faceis.getFaceis());
            this.questoes.add(medias.getMedias());
            this.questoes.add(dificeis.getDificeis());
        }

        public ModeloQuestao getQuestao(int dificuldade, int indice) 
        {
            return this.questoes.get(dificuldade).get(indice);
        }

        public int getSize(int dificuldade)
        {
            return this.questoes.get(dificuldade).size();
        }
}
