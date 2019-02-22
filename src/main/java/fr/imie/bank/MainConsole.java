package fr.imie.bank;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import fr.imie.bank.model.Person;
import fr.imie.bank.DateUtils;

public class MainConsole {

	public static void menu() {
		System.out.println(" ");
		System.out.println("0) Quitter l'application");
		System.out.println("1) Afficher la liste de contact");
		System.out.println("2) Ajouter un contact");
		System.out.println("3) Modifier un contact");
		System.out.println("4) Supprimer un contact");
		System.out.println("5) Exporter la liste de contact");

	}

	public static void menuModifContact() {
		System.out.println(" ");
		System.out.println("Veuillez choisir l'information à modifier pour ce contact :");
		System.out.println(" ");
		System.out.println("1) Modifier le numéro de compte");
		System.out.println("2) Modifier le prénom");
		System.out.println("3) Modifier le nom");
		System.out.println("4) Modifier la date de naissance");
		System.out.println("5) Modifier l'email");

	}

	public static void returnMenu() {
		System.out.println(" ");
		System.out.println("Voulez vous retourner au Menu Principal ? ");
		System.out.println("1) Oui");
		System.out.println("2) Non");

	}

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		List<Person> personnes = null;
		personnes = new ArrayList<Person>();

		String dateBirthUserOrigin = "01/11/1987";
		LocalDate dateBirthUserOrigin1 = LocalDate.parse(dateBirthUserOrigin,
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Person personne1 = new Person("Jaquot", "Latruite", dateBirthUserOrigin1, "jacquot.latruite@gmail.com");
		Person personne2 = new Person("Jacques", "Sparrow", dateBirthUserOrigin1, "jacques.sparrow@gmail.com");
		Person personne3 = new Person("Dominique", "Berret", dateBirthUserOrigin1, "dominique.berret@gmail.com");

		personnes.add(personne1);
		personnes.add(personne2);
		personnes.add(personne3);

		System.out.println(" ");
		System.out.println("Bonjour et bienvenue dans votre gestionnaire de contacts !");
		System.out.println(" ");

		boolean loop = true;
		while (loop == true) {
			menu();

			String chooseMenu = scanner.nextLine();
			int chooseMenu1 = Integer.parseInt(chooseMenu);

			if (chooseMenu1 == 0) {
				System.out.println(" ");
				System.out.println("Vous avez quitté le programme, à bientôt !");
				System.out.println(" ");
				break;
			}
			if (chooseMenu1 == 1) {
				for (int i = 0; i < personnes.size(); i++) {

					System.out.println("Contact n°" + i + personnes.get(i).toString());
				}

//				System.out.println(" ");
//				System.out.println(personnes.toString());
				System.out.println(" ");

				returnMenu();
				String chooseReturnMenu = scanner.nextLine();
				int chooseReturnMenu1 = Integer.parseInt(chooseReturnMenu);
				if (chooseReturnMenu1 == 2) {
					System.out.println("Vous avez quitter le programme, à bientôt !");
					System.out.println(" ");
					break;
				} else if (chooseReturnMenu1 != 1 && chooseReturnMenu1 != 2) {
					System.out.println(
							"La donnée saisie est invalide ! Vous allez être redirigé automatiquement vers le menu principal");
				}

			} else if (chooseMenu1 == 2) {

				System.out.println("Completez le formulaire pour ajoutez un contact :");
				System.out.println(" ");

				System.out.println("Veuillez saisir un Prénom svp :");
				String firstname = scanner.nextLine();

				System.out.println("Veuillez saisir un Nom svp :");
				String lastname = scanner.nextLine();

				System.out.println("Veuillez entrez une date de naissance svp (au format suivant: JJ/MM/AAAA) :");
//				String dateBirth = scanner.nextLine();

				String dateBirth = scanner.nextLine();
				LocalDate dateBirth1 = DateUtils.toDate(dateBirth);
				
				System.out.println("Veuillez saisir un Email svp :");
				String email = scanner.nextLine();
				
//				LocalDate dateBirth1 = LocalDate.parse(dateBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Person personneAdd = new Person(firstname, lastname, dateBirth1, email);
				personnes.add(personneAdd);
				personneAdd = null;
				System.out.println(" ");
				System.out.println("Votre contact à été ajouté !");

				System.out.println("Voulez vous voir la liste des contacts ? ");
				System.out.println("1) Oui");
				System.out.println("2) Non");
				String chooseViewContact = scanner.nextLine();
				int chooseViewContact1 = Integer.parseInt(chooseViewContact);

				if (chooseViewContact1 == 1) {
					for (int i = 0; i < personnes.size(); i++) {
						System.out.println("Contact n°" + i + personnes.get(i).toString());
					}

					returnMenu();
					String chooseReturnMenu = scanner.nextLine();
					int chooseReturnMenu1 = Integer.parseInt(chooseReturnMenu);
					if (chooseReturnMenu1 == 2) {
						System.out.println("Vous avez quitter le programme, à bientôt !");
						System.out.println(" ");
						break;
					} else if (chooseReturnMenu1 != 1 && chooseReturnMenu1 != 2) {
						System.out.println(
								"La donnée saisie est invalide ! Vous allez être redirigé automatiquement vers le menu princiapal");
						System.out.println(" ");
					}

				}

				else if (chooseViewContact1 == 2) {
					System.out.println("Vous avez été redirigé vers le menu principal");
					System.out.println(" ");
				} else {
					System.out.println(
							"Veuillez entrer une donnée valide ! Vous avez été redirigé vers le menu principal");
				}

			} else if (chooseMenu1 == 3) {
				for (int i = 0; i < personnes.size(); i++) {

					System.out.println("Contact n°" + i + personnes.get(i).toString());
				}
				System.out.println(" ");
				System.out.println("Veuillez saisir un le n° du contact que vous voulez modifier :");
				String chooseContactModif = scanner.nextLine();
				int chooseContactModif1 = Integer.parseInt(chooseContactModif);

				if (chooseContactModif1 <= personnes.size()) {
					menuModifContact();
					String chooseModifContact = scanner.nextLine();
					int chooseModifContact1 = Integer.parseInt(chooseModifContact);
					if (chooseModifContact1 == 2) {
						System.out.println("Veuillez entrer le nouveau prénom :");
						String changeFirstname = scanner.nextLine();
						personnes.get(chooseContactModif1).firstname = changeFirstname;
						System.out.println("Le prénom a été changé !");
						System.out.println(" ");
					} else if (chooseModifContact1 == 1) {
						System.out.println("Veuillez entrer le numéro de compte :");
						String changeAcount = scanner.nextLine();
						personnes.get(chooseContactModif1).lastname = changeAcount;
						System.out.println("Le compte a été changé !");
						System.out.println(" ");
					} else if (chooseModifContact1 == 3) {
						System.out.println("Veuillez entrer le nouveau nom :");
						String changeLastname = scanner.nextLine();
						personnes.get(chooseContactModif1).lastname = changeLastname;
						System.out.println("Le nom a été changé !");
						System.out.println(" ");
					} else if (chooseModifContact1 == 4) {
						
						System.out.println("Veuillez entrer la nouvelle date de naissance :");
//						String changeDateBirth = scanner.nextLine();

						String changeDateBirth = scanner.nextLine();
						LocalDate changeDateBirth1 = DateUtils.toDate(changeDateBirth);
						personnes.get(chooseContactModif1).dateBirth = changeDateBirth1;
						System.out.println("La date de naissance a été changé !");
						System.out.println(" ");
					} else if (chooseModifContact1 == 5) {
						System.out.println("Veuillez entrer le nouvel email :");
						String changeEmail = scanner.nextLine();
						personnes.get(chooseContactModif1).email = changeEmail;
						System.out.println("L'Email a été changé !");
						System.out.println(" ");
					}
					System.out.println("Voulez vous voir la liste des contacts ? ");
					System.out.println("1) Oui");
					System.out.println("2) Non");
					String chooseViewContact = scanner.nextLine();
					int chooseViewContact1 = Integer.parseInt(chooseViewContact);
					if (chooseViewContact1 == 1) {
						for (int i = 0; i < personnes.size(); i++) {
							System.out.println("Contact n°" + i + personnes.get(i).toString());
						}
						returnMenu();
						String chooseReturnMenu = scanner.nextLine();
						int chooseReturnMenu1 = Integer.parseInt(chooseReturnMenu);
						if (chooseReturnMenu1 == 2) {
							System.out.println("Vous avez quitter le programme, à bientôt !");
							System.out.println(" ");
							break;
						} else if (chooseReturnMenu1 != 1 && chooseReturnMenu1 != 2) {
							System.out.println(
									"La donnée saisie est invalide ! Vous allez être redirigé automatiquement vers le menu princiapal");
							System.out.println(" ");
						}
					} else if (chooseViewContact1 == 2) {
						System.out.println("Vous avez été redirigé vers le menu principal");
						System.out.println(" ");
					}
				} else {
					System.out.println("Veuillez entrer un numéro de contact valide !");
				}
			} else if (chooseMenu1 == 4) {
				for (int i = 0; i < personnes.size(); i++) {
					System.out.println("Contact n°" + i + personnes.get(i).toString());
				}
				System.out.println(" ");
				System.out.println("Veuillez saisir un le n° du contact que vous voulez supprimer :");
				String chooseContactRemove = scanner.nextLine();
				int chooseContactRemove1 = Integer.parseInt(chooseContactRemove);
				if (chooseContactRemove1 <= personnes.size()) {
					System.out.println("Voulez vous vraiment le supprimer ?");
					System.out.println("1) Oui");
					System.out.println("2) Non");
					String chooseContactRemoveConfirm = scanner.nextLine();
					int chooseContactRemoveConfirm1 = Integer.parseInt(chooseContactRemoveConfirm);
					if (chooseContactRemoveConfirm1 == 1) {
						personnes.remove(chooseContactRemove1);
						System.out.println("Voulez vous voir la liste des contacts ? ");
						System.out.println("1) Oui");
						System.out.println("2) Non");
						String chooseViewContact = scanner.nextLine();
						int chooseViewContact1 = Integer.parseInt(chooseViewContact);
						if (chooseViewContact1 == 1) {
							for (int i = 0; i < personnes.size(); i++) {
								System.out.println("Contact n°" + i + personnes.get(i).toString());
							}
						} else if (chooseViewContact1 == 2) {
							System.out.println("Vous avez été redirigé vers le menu principal");
							System.out.println(" ");
						}

						returnMenu();
						String chooseReturnMenu = scanner.nextLine();
						int chooseReturnMenu1 = Integer.parseInt(chooseReturnMenu);
						if (chooseReturnMenu1 == 2) {
							System.out.println("Vous avez quitter le programme, à bientôt !");
							System.out.println(" ");
							break;
						} else if (chooseReturnMenu1 != 1 && chooseReturnMenu1 != 2) {
							System.out.println(
									"La donnée saisie est invalide ! Vous allez être redirigé automatiquement vers le menu princiapal");
							System.out.println(" ");
						}
					}
				} else {
					System.out.println("Veuillez entrer un numéro de contact valide !");
				}

			} else if (chooseMenu1 == 5) {
				System.out.println(" ");
				System.out.println("Voulez vous voir la liste des contacts avant d'exporter votre liste ? ");
				System.out.println("1) Oui");
				System.out.println("2) Non");
				String chooseViewContact = scanner.nextLine();
				int chooseViewContact1 = Integer.parseInt(chooseViewContact);
				
				if (chooseViewContact1 == 1) {
					for (int i = 0; i < personnes.size(); i++) {
						System.out.println("Contact n°" + i +" :" + personnes.get(i).toString());
					}
				} else if (chooseViewContact1 != 1 && chooseViewContact1 != 2 ) {
					System.out.println("Veuillez entrer un choix valide !");
				}
				System.out.println(" ");
				System.out.println("Voulez vous exporter votre liste de contact en fichier .csv ?");
				System.out.println("1) Oui");
				System.out.println("2) Non");
				String chooseExportList = scanner.nextLine();
				int chooseExportList1 = Integer.parseInt(chooseExportList);

				if (chooseExportList1 == 1) {
					FileWriter fileWriter = new FileWriter("MonFichier1.csv", true);
					fileWriter.write("Compte ; Prénom ; Nom ; Date de naissance ; Email; \r\n");
					for (int i = 0; i < personnes.size(); i++) {
						fileWriter.write(personnes.get(i).toString() + "\r\n");
					}
					fileWriter.close();
					System.out.println("Votre fichier a été créer !");
					System.out.println(" ");
					
				} else if (chooseExportList1 != 2 && chooseExportList1 != 1) {
					System.out.println("Veuillez entrer un choix valide !");
				}
			} else {
				System.out.println("Veuillez entrer un choix valide !");
			}
		}
	}
}
