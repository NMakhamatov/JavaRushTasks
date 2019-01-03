package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        String begin;
        if (modelData.isDisplayDeletedUserList()) begin = "All deleted users:";
        else begin = "All users:";

        System.out.println(begin);
        modelData.getUsers().forEach((user -> System.out.println("\t" + user.toString())));
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers(){
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }
//    public void fireEventUserDeleted(long id){
//        controller.onUserDelete(id);
//    }
}
