Insert into Note values(15.0, 0.0, 20070007, 'PIG602');
Insert into Note values(8.0, 9.0, 20070001, 'PIG701');
Insert into Note values(13.0, 0.0, 20070002, 'PIG701');
Insert into Note values(3.0, 2.0, 20070003, 'PIG701');
Insert into Note values(6.0, 8.0, 20070001, 'PIG702');
Insert into Note values(18.0, 0.0, 20070002, 'PIG702');
Insert into Note values(2.0, 3.0, 20070003, 'PIG702');
Insert into VAE values('PIGU71', 20079999);
Insert into APDJ values('PIGU71', 20070001);
Insert into PointsJury values(1.0, 20070007, 51);
Insert into PointsJury values(10.0, 20070001, 71);
Insert into PointsJury values(2.0, 20070006, 51);
Insert into Redoublant values(3.0, 20070003, 71);
Update Etudiant set pointJuryAnnee = 2.0, scoreToeic = 900 where numEtudiant = 20070006;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 700 where numEtudiant = 20070007;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 700 where numEtudiant = 20070008;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 885 where numEtudiant = 20070001;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 990 where numEtudiant = 20070002;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 255 where numEtudiant = 20070003;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 10 where numEtudiant = 20070004;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 235 where numEtudiant = 20070005;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 700 where numEtudiant = 20079999;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 900 where numEtudiant = 20060006;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 500 where numEtudiant = 20070009;
Update Etudiant set pointJuryAnnee = 0.0, scoreToeic = 500 where numEtudiant = 20070010;
