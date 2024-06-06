<template>
  <div class="login-container">
    <div class="login-box">
      <img :src="require('@/assets/reservas.webp')" alt="Descripción de la imagen" class="img-fluid mb-4">

      
      <div class="card">
          <h2>Login</h2>
          <form @submit.prevent="login" class="login-form">
              <div class="form-group">
                  <label for="username">Username:</label>
                  <input type="text" id="username" v-model="username" required>
              </div>
              <div class="form-group">
                  <label for="password">Password:</label>
                  <input type="password" id="password" v-model="password" required>
              </div>
              <button type="submit" class="login-button">Login</button>
          </form>
      </div>
      <br/>
      <div class="card">
        <h2>MESAS: </h2>
        <div v-if="!loading">
          <p v-if="mesas.length === 0">No hay mesas disponibles.</p>
          <div v-else>
              <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Capacitat</th>
                    <th>Disponible</th>
                </tr>
                </thead>
                <tbody>
                <tr v-for="mesa in mesas" :key="mesa.id">
                    <td>{{ mesa.id }}</td>
                    <td>{{ mesa.cadires }}</td>
                    <td>{{ mesa.disponible }}</td>
                </tr>
                </tbody>
              </table>
          </div>
        </div>
        <div v-else>
          <p>Cargando...</p>
        </div>
      </div>

    </div>
  </div>
</template>


<script>

  export default {
    data() {
      return {
        username: '',
        password: '',
        
        mesas: [], // Variable para almacenar los datos de mesas
        loading: true // Variable para controlar el estado de carga
      };
    },
    mounted() {
      //this.fetchMesas();
    },
    methods: {
      async login() {
        try {
          // Llamada API
          const response = await fetch('localhost:8081/url_api', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json'
            },
            // En BODY es el Json que se le manda a la API
            body: JSON.stringify({
              username: this.username,
              password: this.password
            })
          });

          // Verificar si la respuesta es exitosa (código 200)
          if (response.ok) {
              //const data = await response.json();
              alert("TODO OK");
          } else {
            // Si la respuesta no es exitosa, mostrar un mensaje de error
            console.error('Error en la llamada a la API:', response.statusText);
            alert('Ha ocurrido un error.');
          }
        } catch (error) {
          // Este error es por otro problema con la API
          console.error('Error al autenticar al usuario:', error);
          alert('Ha ocurrido un error. Por favor, inténtalo de nuevo más tarde.');
        }
      },

      async fetchMesas() {
       try {
         const response = await fetch('http://localhost:8081/url_api', {
           method: 'GET',
           headers: {
             'Content-Type': 'application/json'
           }
         });

         if (response.ok) {
           const data = await response.json();
           this.mesas = data; // Asignamos los datos al array mesas después de que se resuelva la promesa
           this.loading = false; // Cambiamos el estado de carga a falso cuando se hayan cargado los datos
         } else {
           console.error('Error en la llamada a la API:', response.statusText);
           alert('Ha ocurrido un error.');
         }
       } catch (error) {
         console.error('Error al autenticar al usuario:', error);
         alert('Ha ocurrido un error. Por favor, inténtalo de nuevo más tarde.');
       }
     }
    }
  };
</script>

<style scoped>
.login-container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}

.login-box {
  width: 400px;
}

.card {
  margin-top: 20px;
}

.card-header {
  border-radius: 0.25rem;
}

.card-body {
  padding: 1.25rem;
}

.card-title {
  font-size: 1.25rem;
  margin-bottom: 0.75rem;
}

.card-text {
  color: #6c757d;
}
</style>
