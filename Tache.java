    public class Tache {
        private String description;
        private boolean estfaite;

        public Tache(String description, boolean estfaite){
            this.description = description;
            this.estfaite = estfaite;
        }

        public void afficher(){
            if (estfaite == false){
                System.out.println("[ ]" + description);
            }
            else System.out.println("[X]" + description);
        }

        public void cocher(){
            if (estfaite == true){
                estfaite = false;
            }
            else estfaite = true;
        }

    }
