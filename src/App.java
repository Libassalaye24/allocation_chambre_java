import java.util.Scanner;

import models.Chambre;
import models.EtatChambre;
import models.Pavillon;
import models.TypeChambre;
import services.ChambreService;
import services.PavillonService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choix;
        ChambreService chambreService = new ChambreService();
        PavillonService pavillonService = new PavillonService();
        Chambre chambre;
        int typeChambre, idPavillon;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Ajouter un Chambre");
            System.out.println("2 - Lister chambre");
            System.out.println("3 - archiver Chambre");
            System.out.println("4 - supprimer Chambre");
            System.out.println("5 - modifier Chambre");
            System.out.println("6 - Ajouter un pavillon");
            System.out.println("7 - Lister pavillon");
            System.out.println("8 - Modifer un pavillon");
            System.out.println("9 - Quitter");
            System.out.println(" - Veillez faire un choix");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("===== ajout chambre =====");
                    chambre = new Chambre();
                    System.out.println("saisir le numero de l'etage");
                    chambre.setNumEtage(scanner.next());
                    System.out.println("saisir le type de la chambre");
                    System.out.println(" 1: Individuelle , 2: Double");
                    typeChambre = scanner.nextInt();
                    if (typeChambre == 1) {
                        chambre.setType(TypeChambre.INDIVIDUELLE);

                    } else if (typeChambre == 2) {
                        chambre.setType(TypeChambre.DOUBLE);
                    } else {
                        System.out.println(" - Veillez faire un bon choix");
                        break;
                    }
                    System.out.println("voulez-vous lui affecter un pavillon ?");
                    System.out.println("== 1:oui , 2:non ==");
                    int ch = scanner.nextInt();
                    if (ch == 1) {
                        pavillonService.affichePavillon();
                        System.out.println("veillez saisir l'id du pavillon");
                        idPavillon = scanner.nextInt();
                        Pavillon pavillon2 = pavillonService.recherchePavillon(idPavillon);
                        if (pavillon2 != null) {
                            chambreService.addChambre(chambre, pavillon2);
                        } else {
                            System.out.println("pavillon inexistant");
                            break;
                        }
                    } else if (ch == 2) {
                        chambreService.addChambre(chambre);
                    } else {
                        System.out.println("choix inexistant");
                    }

                    break;
               
                case 2:
                    System.out.println("===== Lister chambre =====");
                    chambreService.afficheChambre(EtatChambre.DISPONIBLE);
                    break;
                case 3:
                    System.out.println("===== archiver chambre =====");
                    chambreService.afficheChambre(EtatChambre.DISPONIBLE);
                    System.out.println("- veiller saisir l'id de la chambre ");
                    int idChambre;
                    idChambre = scanner.nextInt();
                    chambre = chambreService.rechercheChambre(idChambre);
                    if (chambre == null) {
                        System.out.println("=== chambe inexistant ===");
                    } else {
                        chambreService.archiveChambre(chambre);
                    }

                    break;
                case 4:
                    System.out.println("===== supprimer chambre =====");
                    chambreService.afficheChambre(EtatChambre.DISPONIBLE);
                    System.out.println("- veiller saisir l'id de la chambre ");
                    int id;
                    id = scanner.nextInt();
                    chambre = chambreService.rechercheChambre(id);
                    if (chambre == null) {
                        System.out.println("=== chambre inexistant ===");
                    } else {
                        chambreService.supprimerChambre(chambre);
                    }
                    break;
                case 5:
                    System.out.println("===== modifier chambre =====");
                    chambreService.afficheChambre(EtatChambre.DISPONIBLE);
                    System.out.println("- veillez saisir l'id de la chambre ");
                    int idChamb;
                    idChamb = scanner.nextInt();
                    chambre = chambreService.rechercheChambre(idChamb);
                    if (chambre != null) {
                        System.out.println("saisir numero d'etage");
                        chambre.setNumEtage(scanner.next());
                        System.out.println("saisir le type de la chambre");
                        System.out.println(" 1: Individuelle , 2: Double");
                        typeChambre = scanner.nextInt();
                        if (typeChambre == 1) {
                            chambre.setType(TypeChambre.INDIVIDUELLE);
                        } else if (typeChambre == 2) {
                            chambre.setType(TypeChambre.DOUBLE);
                        } else {
                            System.out.println(" - Veiller faire un bon choix");
                            break;
                        }
                        chambreService.modifierChambre(chambre);
                        break;
                    } else {
                        System.out.println("chambre inexistant");
                    }
                    break;
                case 6:
                    System.out.println("===== ajouter pavillon =====");
                    Pavillon pavillon = new Pavillon();
                    System.out.println("saisir le numero de pavillon ");
                    pavillon.setNumPavillon(scanner.next());
                    System.out.println("saisir le nombre d'etage ");
                    pavillon.setNbrEtage(scanner.next());
                    pavillonService.addPavillon(pavillon);
               
                case 7:
                    System.out.println("===== lister pavillon =====");
                    pavillonService.affichePavillon();
                    break;
                case 8:
                    System.out.println("===== modifier pavillon =====");
                    pavillonService.affichePavillon();
                    System.out.println("- veillez saisir l'id du pavillon ");
                    idPavillon = scanner.nextInt();
                    Pavillon pavi = pavillonService.recherchePavillon(idPavillon);
                    if (pavi != null) {
                        System.out.println("saisir le numero de pavillon ");
                        pavi.setNumPavillon(scanner.next());
                        System.out.println("saisir le nombre d'etage ");
                        pavi.setNbrEtage(scanner.next());
                        pavillonService.modifierPavillon(pavi);
                    } else {
                        System.out.println("=== pavillon inexistant ===");
                    }
                    break;
                default:
                    System.out.println("=== choix inexistant ===");
                    break;
            }

        } while (choix != 9);
        scanner.close();
    }
}
