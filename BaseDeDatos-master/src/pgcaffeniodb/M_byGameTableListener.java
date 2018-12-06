/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgcaffeniodb;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author rnavarro
 */
public class M_byGameTableListener implements TableModelListener  {
    
    private final Database db;
    
    public M_byGameTableListener(Database d) {
        super();
        db = d;
    }

    @Override
    public void tableChanged(TableModelEvent event) {
        JDBCTableAdpater modelo = (JDBCTableAdpater) event.getSource();        
       
        int row = event.getFirstRow();
        int column = event.getColumn();
        int type = event.getType();
        
        //No se puede modificar una clave primaria
        if( column == 0  ) {
            return;
        }      
        
        String colName = modelo.getColumnName(column);
        String colSQLName = modelo.getSQLColumnName(column);        
        String sql = String.format(
                "UPDATE matches_by_games SET %s = %s WHERE match_id = \'%s\'",
                colSQLName,
                modelo.getValueAt(row, column),
                modelo.getValueAt(row, 0));
        
        try {
            db.update(sql);
        } catch (SQLException ex) {           
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
    }
    
    
}
