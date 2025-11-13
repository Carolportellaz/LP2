package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Classes.DAO;

public class Contrato {
	private String data;
	private double valor;
	private double parcela;
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	DAO banco = new DAO();
	
	public Contrato() {
		
	}
	
	public Contrato(String data, double valor, double parcela) {
		super();
		this.data = data;
		this.valor = valor;
		this.parcela = parcela;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getParcela() {
		return parcela;
	}
	
	public void setParcela(double parcela) {
		this.parcela = parcela;
	}
	
	public boolean save() {
		String sql = "insert into contratos (data, valor, parcela) values (?, ?, ?)";
		this.conexao = banco.conectar();
		
		try {
			pst = this.conexao.prepareStatement(sql);
			pst.setString(1, this.data);
			pst.setDouble(2, this.valor);
			pst.setDouble(3, this.parcela);
			pst.executeUpdate();			
			return true;
		}
		
		catch(Exception e) {
			System.out.println("Ocorreu o seguinte erro " + e.getMessage());
			return false;
		}
	}
	
	public ArrayList<Contrato> getAll(){
		String sql = "select * from contratos";
		ArrayList<Contrato> contratos = new ArrayList<>();
		conexao = banco.conectar();
		
		try {
			pst = conexao.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				int i = rs.getInt(1);
				String data = rs.getString(2);
				double valor = rs.getDouble(3);
				double parcela = rs.getDouble(4);
				
				contratos.add(new Contrato(data, valor, parcela));
			}
		}
		
		
		catch(Exception e) {
			System.out.println("Ocorreu o seguinte erro ao tentar listar todos " + e.getMessage());
		}
		
		return contratos;
	}
	
	
}
