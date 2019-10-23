/*
 * Copyright 2019 kriticalflare.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.railway.reservation.models;

/**
 *
 * @author kriticalflare
 */
public class Ticket {

    private String usernameT;
    private String boardingStation;
    private String deboardingStation;
    private String berthtype;
    private int quantity;
    private int amount;

    public Ticket(String usernameT,
            String boardingStation,
            String deboardingStation,
            String berthtype,
            int quantity,
            int amount) {

        this.usernameT = usernameT;
        this.boardingStation = boardingStation;
        this.deboardingStation = deboardingStation;
        this.berthtype = berthtype;
        this.quantity = quantity;
        this.amount = amount;

    }

    public String getUsername() {
        return usernameT;
    }

    public String getBoarding() {
        return boardingStation;
    }

    public String getDeboarding() {
        return deboardingStation;
    }

    public String getBerth() {
        return berthtype;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setUsername(String usernameT) {
        this.usernameT = usernameT;
    }

    public void setBoarding(String boardingStation) {
        this.boardingStation = boardingStation;
    }

    public void setDeboarding(String deboardingStation) {
        this.deboardingStation = deboardingStation;
    }

    public void setBerth(String berthtype) {
        this.berthtype = berthtype;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
