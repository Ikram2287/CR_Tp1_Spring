# CR_Tp1_Spring
// GestionMaterielServiceImpl----ces methode est implementé dans ListeMateriel
        listeMateriel.supprimerMat(materiel);
        listeMateriel.ajouterMateriel(materiel);

 //Calcul de nombre de chaises et de bureau
 for( Materiel m : listeMateriel){
            if(m.getClass().getName().equals("Bureau")){
                nbBureau++;
            }else{
                nbChaise++;
            }
         }
 
