package com.example.applicationapp.k8sClient;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

public class K8sClient {


    public static void main(String[] args) {

        Config config = new ConfigBuilder().withMasterUrl("http://192.168.89.131:8080").build();
        KubernetesClient client = new DefaultKubernetesClient(config);
        client.replicationControllers().
                inNamespace("default").withName("my-nginx").scale(0);

        System.out.println(client.replicationControllers().
                inNamespace("default").withName("nginx-rc").get().getSpec().getReplicas());

//
//        ClientPodResource<Pod, DoneablePod> aDefault = client.pods().inNamespace("default").withName("nginx-pod");
//
//        Service myservice = client.services().inNamespace("default").withName("nginx-service").get();
//        System.out.println(myservice.toString());
//
//
//        client.pods().inNamespace("default").withName("nginx-service")




    }
}
