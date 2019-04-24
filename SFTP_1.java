package com.bstmexico;
import com.jcraft.jsch.ChannelSftp;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

import java.io.FileInputStream;

public class SFTP_1 {

    public static void main(String[] args) throws Exception{
        try {
            JSch jsch = new JSch();
            System.out.println("------------------- INICIO");
            String user = "svfe";
            String host = "192.168.238.47";
            Integer port = 22;

            String privateKey = "c:/Users/pablocs/Desktop/bpc_tc.pem";

            //String privateKey = "c://Users//pablocs//Desktop//MarioPrivate.ppk";
            jsch.setKnownHosts(new FileInputStream("C:/Users/pablocs/Desktop/KnownHostKeys.txt"));


            jsch.addIdentity(privateKey,"wld72000");
            System.out.println("identity added ");
            Session session = jsch.getSession(user, host, port);
            System.out.println("session created.");

            session.connect();
            System.out.println("session connected.....");



            ChannelSftp sftp = (ChannelSftp)session.openChannel("sftp");
        sftp.connect();

        sftp.cd("/home/svfe/Prueba1");
        System.out.println("Subiendo c:/Users/pablocs/Documents/Ejemplo.txt ...");
        sftp.put("c:/Users/pablocs/Documents/Ejemplo.txt", "Ejemplo.txt");

        System.out.println("Archivos subidos.");

        sftp.exit();
        sftp.disconnect();
        session.disconnect();

        System.out.println("----------------- FIN");
        } catch (Exception e){
            System.err.println(e);
        }

}}