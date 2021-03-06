/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgcaffeniodb;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maestro
 */
public class MainApp extends javax.swing.JFrame {

    //private final String USER = "usr210215739";
    //private final String PASS = "pw210215739";
    private final String USER = "postgres";
    private final String PASS = "pamela";
    final private Database db;

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        //Abrir la conexión a la base de datos
        db = Database.getDatabase(USER, PASS);
        initComponents();
        this.setSize(800, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();
        iPlayer = new javax.swing.JMenuItem();
        iTeam = new javax.swing.JMenuItem();
        iGame = new javax.swing.JMenuItem();
        iLeague = new javax.swing.JMenuItem();
        iMatch = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuBrowse = new javax.swing.JMenu();
        bPlayers = new javax.swing.JMenuItem();
        bTeams = new javax.swing.JMenuItem();
        bGames = new javax.swing.JMenuItem();
        bLeagues = new javax.swing.JMenuItem();
        bMatches = new javax.swing.JMenuItem();
        bRankings = new javax.swing.JMenuItem();
        bPlayed_Matches = new javax.swing.JMenuItem();
        bMatches_by_Games = new javax.swing.JMenuItem();
        bGame_Leagues = new javax.swing.JMenuItem();
        menuDelete = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Editar");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        menuInsertar.setText("Insertar");

        iPlayer.setText("Player");
        iPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iPlayerActionPerformed(evt);
            }
        });
        menuInsertar.add(iPlayer);

        iTeam.setText("Team");
        iTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iTeamActionPerformed(evt);
            }
        });
        menuInsertar.add(iTeam);

        iGame.setText("Game");
        iGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iGameActionPerformed(evt);
            }
        });
        menuInsertar.add(iGame);

        iLeague.setText("League");
        iLeague.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iLeagueActionPerformed(evt);
            }
        });
        menuInsertar.add(iLeague);

        iMatch.setText("Match");
        iMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMatchActionPerformed(evt);
            }
        });
        menuInsertar.add(iMatch);

        jMenuItem1.setText("Ranking");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem1);

        jMenuItem2.setText("Played Matches");
        menuInsertar.add(jMenuItem2);

        jMenuItem3.setText("Matches by Game");
        menuInsertar.add(jMenuItem3);

        jMenuItem4.setText("Game Leagues");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuInsertar.add(jMenuItem4);

        menuBar.add(menuInsertar);

        menuBrowse.setText("Browse");
        menuBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrowseActionPerformed(evt);
            }
        });

        bPlayers.setText("Players");
        bPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayersActionPerformed(evt);
            }
        });
        menuBrowse.add(bPlayers);

        bTeams.setText("Teams");
        bTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTeamsActionPerformed(evt);
            }
        });
        menuBrowse.add(bTeams);

        bGames.setText("Games");
        bGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGamesActionPerformed(evt);
            }
        });
        menuBrowse.add(bGames);

        bLeagues.setText("Leagues");
        bLeagues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLeaguesActionPerformed(evt);
            }
        });
        menuBrowse.add(bLeagues);

        bMatches.setText("Matches");
        bMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMatchesActionPerformed(evt);
            }
        });
        menuBrowse.add(bMatches);

        bRankings.setText("Ranking");
        bRankings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRankingsActionPerformed(evt);
            }
        });
        menuBrowse.add(bRankings);

        bPlayed_Matches.setText("Played Matches");
        bPlayed_Matches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayed_MatchesActionPerformed(evt);
            }
        });
        menuBrowse.add(bPlayed_Matches);

        bMatches_by_Games.setText("Matches by Game");
        bMatches_by_Games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMatches_by_GamesActionPerformed(evt);
            }
        });
        menuBrowse.add(bMatches_by_Games);

        bGame_Leagues.setText("Game Leagues");
        bGame_Leagues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGame_LeaguesActionPerformed(evt);
            }
        });
        menuBrowse.add(bGame_Leagues);

        menuBar.add(menuBrowse);

        menuDelete.setText("Borrar");

        jMenuItem11.setText("Player");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem11);

        jMenuItem12.setText("Team");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuDelete.add(jMenuItem12);

        jMenuItem14.setText("Inventario café");
        menuDelete.add(jMenuItem14);

        jMenuItem15.setText("Inventario mercancias");
        menuDelete.add(jMenuItem15);

        jMenu1.setText("Proveedores");

        jMenuItem16.setText("Por clave");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuItem13.setText("Por nombre");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        menuDelete.add(jMenu1);

        menuBar.add(menuDelete);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void bPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayersActionPerformed

        final String sql = "SELECT * FROM public.player ORDER BY player_id";

        final String labels[] = {"ID", "Team", "First name",
            "Last name", "Gender", "Hometown", "Other details"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new PlayerTableListener(db)); // ESTA ES LA QUE VAS A COPIAR ABAJO DE LA DE ARRIBA

            TableBrowser browser = new TableBrowser("Players", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bPlayersActionPerformed

    private void iPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iPlayerActionPerformed
        InsertPlayerDialog dlg = new InsertPlayerDialog(this, db);
        dlg.setVisible(true);
    }//GEN-LAST:event_iPlayerActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        DeleteCoffeeDialog dialog = new DeleteCoffeeDialog(new javax.swing.JFrame(), db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void iTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iTeamActionPerformed
        InsertTeamDialog dialogo = new InsertTeamDialog(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_iTeamActionPerformed

    private void bTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTeamsActionPerformed
        final String sql = "SELECT * FROM team ORDER BY team_id";
        final String labels[] = {"ID", "Name", "Date created",
            "Date disbanded", "Other details", "Game played"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new TeamTableListener(db));

            TableBrowser browser = new TableBrowser("Teams", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }


    }//GEN-LAST:event_bTeamsActionPerformed

    private void bGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGamesActionPerformed
        final String sql = "SELECT * FROM game ORDER BY game_code";
        final String labels[] = {"ID", "Name", "Description", "Other details"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Games", modelo);

            modelo.addTableModelListener(new GameTableListener(db));

            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_bGamesActionPerformed

    private void bLeaguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLeaguesActionPerformed
        final String sql = "SELECT * FROM leagues";
        final String labels[] = {"ID", "Name", "Details"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);

            modelo.addTableModelListener(new LeaguesTableListener(db));

            TableBrowser browser = new TableBrowser("Leagues", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_bLeaguesActionPerformed

    private void menuBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrowseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBrowseActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        DeleteSuppliersDialog dialog = new DeleteSuppliersDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        DeleteCoffeeHousesDialog dialog = new DeleteCoffeeHousesDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        DeleteProveedorDialog dialogo = new DeleteProveedorDialog(this, db);
        dialogo.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void bMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMatchesActionPerformed
        final String sql = "SELECT * FROM matches";
        final String labels[] = {"ID", "Duration", "Date", "Result"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Matches", modelo);
            modelo.addTableModelListener(new MatchesTableListener(db));

            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_bMatchesActionPerformed

    private void bRankingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRankingsActionPerformed
        final String sql = "SELECT * FROM team_ranked ORDER BY game_code, ranking";
        final String labels[] = {"ID", "Game", "Ranking"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Rankings", modelo);

            modelo.addTableModelListener(new RankingsTableListener(db));

            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_bRankingsActionPerformed

    private void bPlayed_MatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayed_MatchesActionPerformed
        final String sql = "SELECT * FROM played_matches ORDER BY game_code";
        final String labels[] = {"Team 1", "Team 2", "Match", "Game"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Played Matches", modelo);
            
            modelo.addTableModelListener(new P_matchesTableListener(db));
            
            
            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_bPlayed_MatchesActionPerformed

    private void bMatches_by_GamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMatches_by_GamesActionPerformed
        final String sql = "SELECT * FROM matches_by_games ORDER BY game_code";
        final String labels[] = {"Game", "Match"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Matches by Game", modelo);
                        modelo.addTableModelListener(new M_byGameTableListener(db));

            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }        }//GEN-LAST:event_bMatches_by_GamesActionPerformed

    private void bGame_LeaguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGame_LeaguesActionPerformed
        final String sql = "SELECT * FROM games_have_leagues ORDER BY game_code";
        final String labels[] = {"League", "Game"};
        try {
            ResultSet rs = db.query(sql);

            JDBCTableAdpater modelo = new JDBCTableAdpater(rs, labels);
            TableBrowser browser = new TableBrowser("Game Leagues", modelo);
                        modelo.addTableModelListener(new G_LeaguesTableListener(db));

            browser.setVisible(true);
            this.desktopPane.add(browser);

        } catch (SQLException ex) {

        }        }//GEN-LAST:event_bGame_LeaguesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void iGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iGameActionPerformed
        InsertGameDialog dialog = new InsertGameDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_iGameActionPerformed

    private void iLeagueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iLeagueActionPerformed
        InsertLeagueDialog dialog = new InsertLeagueDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_iLeagueActionPerformed

    private void iMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMatchActionPerformed
        InsertMatchesDialog d = new InsertMatchesDialog(this, db);
        d.setVisible(true);
    }//GEN-LAST:event_iMatchActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        InsertGameLeaguesDialog d = new InsertGameLeaguesDialog(this, db);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem bGame_Leagues;
    private javax.swing.JMenuItem bGames;
    private javax.swing.JMenuItem bLeagues;
    private javax.swing.JMenuItem bMatches;
    private javax.swing.JMenuItem bMatches_by_Games;
    private javax.swing.JMenuItem bPlayed_Matches;
    private javax.swing.JMenuItem bPlayers;
    private javax.swing.JMenuItem bRankings;
    private javax.swing.JMenuItem bTeams;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem iGame;
    private javax.swing.JMenuItem iLeague;
    private javax.swing.JMenuItem iMatch;
    private javax.swing.JMenuItem iPlayer;
    private javax.swing.JMenuItem iTeam;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBrowse;
    private javax.swing.JMenu menuDelete;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
